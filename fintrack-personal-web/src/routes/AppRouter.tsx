import { BrowserRouter, Route, Routes } from "react-router-dom";
import AdminPage from "../pages/AdminPage";

function AppRouter() {
    return (
        <BrowserRouter>
            <Routes>
                <Route
                    path="/"
                    element={<AdminPage />}
                />
            </Routes>
        </BrowserRouter>
    );
}

export default AppRouter;
