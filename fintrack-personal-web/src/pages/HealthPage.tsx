import { useEffect, useState } from "react";
import { getHealth } from "../services/healthService";

interface Health {
    status: string;
    application: string;
}

function HealthPage() {
    const [health, setHealth] = useState<Health | null>(null);

    useEffect(() => {
        const fetchHealth = async () => {
            try {
                const healthData = await getHealth();
                setHealth(healthData);
            } catch (error) {
                console.error("Error al conectar con el backend:", error);
                setHealth({ status: "ERROR", application: "No conectado" });
            }
        };

        void fetchHealth();
    }, []);

    return (
        <div className="min-h-screen flex items-center justify-center bg-slate-100">
            <div className="bg-white rounded-lg shadow-md p-8 min-w-100">
                <h1 className="text-3xl font-bold text-center text-blue-600 mb-6">
                    FinTrack Personal
                </h1>

                {health ? (
                    <div className="space-y-2">
                        <p className="flex items-center gap-2">
                            Estado:
                            <strong className={health.status === "UP" ? "text-green-600" : "text-red-600"}>
                                {health.status}
                            </strong>
                            <span className={health.status === "UP" ? "text-green-500" : "text-red-500"}>
                                {health.status === "UP" ? "✓" : "✗"}
                            </span>
                        </p>

                        <p className="text-gray-700">
                            Aplicación: <strong>{health.application}</strong>
                        </p>
                    </div>
                ) : (
                    <p className="text-gray-500">Cargando...</p>
                )}
            </div>
        </div>    );
}

export default HealthPage;