import { BrowserRouter, Route, Routes } from "react-router-dom";
import AdminPage from "../pages/AdminPage";
import HealthPage from "../pages/HealthPage";

function AppRouter() {
    return (
        <BrowserRouter>
            <Routes>
                <Route
                    path="/"
                    element={<HealthPage />}
                />
                <Route
                    path="/admin"
                    element={<AdminPage />}
                />
            </Routes>
        </BrowserRouter>
    );
}

export default AppRouter;
