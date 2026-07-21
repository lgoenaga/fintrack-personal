import { useEffect, useState } from "react";
import { usuarioService } from "../services/usuarioService";
import type { UsuarioResponse } from "../types/UsuarioResponse";

function AdminPage() {

    const [usuario, setUsuario] = useState<UsuarioResponse | null>(null);

    useEffect(() => {
        const cargarAdministrador = async () => {
            try {
                const data = await usuarioService.obtenerAdministrador();

                setUsuario(data);
            } catch (error) {
                console.error(
                    "Error consultando administrador",
                    error
                );
            }
        };

        void cargarAdministrador();
    }, []);

    if (!usuario) {
        return (
            <div className="min-h-screen flex items-center justify-center">
                <p>Cargando administrador...</p>
            </div>
        );
    }

    return (
        <div className="min-h-screen flex items-center justify-center bg-slate-100">
            <div className="bg-white shadow-lg rounded-lg p-8 min-w-[500px]">
                <h1 className="text-3xl font-bold text-blue-600 mb-6">
                    Administrador Inicial
                </h1>

                <div className="space-y-3">
                    <p>
                        <strong>ID:</strong> {usuario.id}
                    </p>

                    <p>
                        <strong>Username:</strong> {usuario.username}
                    </p>

                    <p>
                        <strong>Nombre:</strong> {usuario.nombre}
                    </p>

                    <p>
                        <strong>Rol:</strong> {usuario.rol}
                    </p>

                    <p>
                        <strong>Activo:</strong>{" "}
                        {usuario.activo ? "Sí" : "No"}
                    </p>

                    <p>
                        <strong>Requiere cambio de contraseña:</strong>{" "}
                        {usuario.requiereCambioPassword
                            ? "Sí"
                            : "No"}
                    </p>
                </div>
            </div>
        </div>
    );
}

export default AdminPage;