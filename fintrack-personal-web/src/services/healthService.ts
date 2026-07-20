import { api } from "./api";

/**
 * Interfaz que representa la respuesta del endpoint de health.
 */
export interface HealthResponse {
    status: string;
    application: string;
}

/**
 * Obtiene el estado de salud de la API.
 *
 * @returns datos del estado de la aplicación
 */
export const getHealth = async (): Promise<HealthResponse> => {
    const response = await api.get<HealthResponse>("/health");
    return response.data;
};

