const express = require('express');
const request = require('request');
const app = express();

app.use((req, res) => {
    const url = req.url.slice(1); // Eliminar la barra inicial
    request({ url: url, headers: { 'User-Agent': 'Mozilla/5.0' } })
        .on('response', function(response) {
            res.writeHead(response.statusCode, response.headers);
        })
        .pipe(res);
});

app.listen(3000, () => {
    console.log('Proxy corriendo en http://localhost:3000');
});
