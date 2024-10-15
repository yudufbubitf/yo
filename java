import React, { useState } from 'react';
import axios from 'axios';

function App() {
    const [url, setUrl] = useState('');
    const [data, setData] = useState(null);

    const handleSubmit = async (e) => {
        e.preventDefault();
        const response = await axios.get(`http://localhost:5000/proxy?url=${url}`);
        setData(response.data);
    };

    return (
        <div>
            <h1>Proxy Web Dashboard</h1>
            <form onSubmit={handleSubmit}>
                <input 
                    type="text" 
                    value={url} 
                    onChange={(e) => setUrl(e.target.value)} 
                    placeholder="Ingrese la URL" 
                />
                <button type="submit">Enviar</button>
            </form>
            {data && <pre>{JSON.stringify(data, null, 2)}</pre>}
        </div>
    );
}

export default App;
