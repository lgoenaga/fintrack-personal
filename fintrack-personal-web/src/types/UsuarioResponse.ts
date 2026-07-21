export interface UsuarioResponse {
    id: string;
    username: string;
    nombre: string;
    rol: string;
    activo: boolean;
    requiereCambioPassword: boolean;
}