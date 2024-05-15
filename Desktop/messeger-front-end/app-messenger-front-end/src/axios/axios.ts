import axios from "axios";

const api = axios.create({
    baseURL: import.meta.env.VITE_REACT_APP_BASE_URL,
    timeout: 10000,
    headers: {'Content-Type': 'application/json',
        Authorization : "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJSZW1lZGlvc19hcGkiLCJzdWIiOiJ0ZXN0ZSIsImV4cCI6MTcxNTgxOTY5OX0.jidebbkwMRfAJr_lDgyM9rPiSDh0lNMwMHMc5i83Dhc"
    }
});

export default api;