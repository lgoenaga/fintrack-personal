import { api } from "./api";
import type { UsuarioResponse } from "../types/UsuarioResponse";

export const usuarioService = {
    async obtenerAdministrador(): Promise<UsuarioResponse> {
        const { data } = await api.get<UsuarioResponse>(
            "/usuarios/admin"
        );

        return data as UsuarioResponse;
    },
};
