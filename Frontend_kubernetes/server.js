const express = require('express');
const axios = require('axios');
const app = express();
const PORT = 3000;

app.get('/', async (req, res) => {
    const response = await axios.get('http://backend-service:8000/');
    res.send(`<h1>${response.data.message}</h1>`);
});

app.listen(PORT, () => console.log(`Frontend running on port ${PORT}`));
