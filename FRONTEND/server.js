const express = require('express');
const cors = require('cors');
const path = require('path');
const app = express();

app.use(cors()); // Permite requisições de outras origens
app.use(express.static(path.join(__dirname, 'public')));

app.get('*', (req, res) => {
  res.sendFile(path.join(__dirname, 'public/index.html'));
});

const PORT = process.env.PORT || 8081; // Certifique-se de que a porta 8081 está sendo usada
app.listen(PORT, () => {
  console.log(`Servidor rodando na porta ${PORT}`);
});
