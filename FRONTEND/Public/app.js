// Função para carregar as solicitações do backend
function carregarSolicitacoes() {
    fetch('http://localhost:8081/solicitacoes')
        .then(response => response.json())
        .then(data => {
            const lista = document.getElementById("solicitacoesList");
            lista.innerHTML = ''; // Limpar a lista atual

            data.forEach(solicitacao => {
                // Criar o item de solicitação
                const li = document.createElement("li");
                li.id = solicitacao.id; // Adiciona o id para poder excluir depois
                li.innerHTML = `
                    <span>${solicitacao.nomePassageiro} - ${solicitacao.status}</span>
                    <button class="delete" onclick="excluirSolicitacao(${solicitacao.id})">Excluir</button>
                `;
                lista.appendChild(li);
            });
        })
        .catch(error => console.error('Erro ao carregar as solicitações:', error));
}

// Função para adicionar nova solicitação ao backend
function adicionarSolicitacao() {
    const nomePassageiro = document.getElementById("nomePassageiro").value;
    const dataHoraChegada = document.getElementById("dataHoraChegada").value;
    const cidadeOrigem = document.getElementById("cidadeOrigem").value;
    const cidadeDestino = document.getElementById("cidadeDestino").value;
    const dataHoraSaida = document.getElementById("dataHoraSaida").value;
    const ciaAerea = document.getElementById("ciaAerea").value;

    if (nomePassageiro.trim() !== "" && dataHoraChegada && cidadeOrigem && cidadeDestino && dataHoraSaida && ciaAerea) {
        const novaSolicitacao = {
            nomePassageiro,
            dataHoraChegada,
            cidadeOrigem,
            cidadeDestino,
            dataHoraSaida,
            ciaAerea
        };

        fetch('http://localhost:8081/solicitacoes', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(novaSolicitacao) 
        })
        .then(response => response.json())
        .then(data => {
            // Adicionar a nova solicitação à lista na tela
            const lista = document.getElementById("solicitacoesList");
            const li = document.createElement("li");
            li.id = data.id; // Adiciona o id para poder excluir depois
            li.innerHTML = `
                <span>${data.nomePassageiro} - ${data.status}</span>
                <button class="delete" onclick="excluirSolicitacao(${data.id})">Excluir</button>
            `;
            lista.appendChild(li);

            // Limpar os campos de entrada
            document.getElementById("nomePassageiro").value = '';
            document.getElementById("dataHoraChegada").value = '';
            document.getElementById("cidadeOrigem").value = '';
            document.getElementById("cidadeDestino").value = '';
            document.getElementById("dataHoraSaida").value = '';
            document.getElementById("ciaAerea").value = '';
        })
        .catch(error => {
            console.error('Erro ao adicionar solicitação:', error);
        });
    } else {
        alert("Por favor, preencha todos os campos obrigatórios.");
    }
}

// Função para excluir uma solicitação
function excluirSolicitacao(id) {
    fetch(`http://localhost:8081/solicitacoes/${id}`, {
        method: 'DELETE',
    })
    .then(() => {
        // Remover a solicitação da lista após excluir do backend
        const lista = document.getElementById("solicitacoesList");
        const solicitacao = document.getElementById(id);
        if (solicitacao) {
            lista.removeChild(solicitacao);
        }
    })
    .catch(error => console.error('Erro ao excluir solicitação:', error));
}

// Função para gerar solicitações fictícias
function gerarSolicitacoes() {
    const solicitacoes = [
        { nomePassageiro: "João Silva", status: "Em processo", dataHoraChegada: "2025-03-25T14:00", cidadeOrigem: "São Paulo", cidadeDestino: "Rio de Janeiro", dataHoraSaida: "2025-03-25T12:00", ciaAerea: "LATAM" },
        { nomePassageiro: "Maria Oliveira", status: "Em processo", dataHoraChegada: "2025-03-25T14:30", cidadeOrigem: "São Paulo", cidadeDestino: "Belo Horizonte", dataHoraSaida: "2025-03-25T13:00", ciaAerea: "Gol" },
        { nomePassageiro: "Carlos Souza", status: "Em processo", dataHoraChegada: "2025-03-25T15:00", cidadeOrigem: "São Paulo", cidadeDestino: "Curitiba", dataHoraSaida: "2025-03-25T13:30", ciaAerea: "Azul" },
        { nomePassageiro: "Ana Pereira", status: "Em processo", dataHoraChegada: "2025-03-25T16:00", cidadeOrigem: "São Paulo", cidadeDestino: "Fortaleza", dataHoraSaida: "2025-03-25T14:00", ciaAerea: "Avianca" },
        { nomePassageiro: "Pedro Costa", status: "Em processo", dataHoraChegada: "2025-03-25T16:30", cidadeOrigem: "São Paulo", cidadeDestino: "Salvador", dataHoraSaida: "2025-03-25T14:30", ciaAerea: "Gol" }
    ];

    solicitacoes.forEach(solicitacao => {
        fetch('http://localhost:8081/solicitacoes', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(solicitacao)
        })
        .then(response => response.json())
        .then(data => {
            // Adicionar a nova solicitação à lista na tela
            const lista = document.getElementById("solicitacoesList");
            const li = document.createElement("li");
            li.id = data.id; // Adiciona o id para poder excluir depois
            li.innerHTML = `
                <span>${data.nomePassageiro} - ${data.status}</span>
                <button class="delete" onclick="excluirSolicitacao(${data.id})">Excluir</button>
            `;
            lista.appendChild(li);
        })
        .catch(error => console.error('Erro ao gerar solicitações:', error));
    });
}

// Carregar as solicitações ao iniciar a página
document.addEventListener('DOMContentLoaded', carregarSolicitacoes);
