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
                li.innerHTML = `
                    ${solicitacao.nomePassageiro} - ${solicitacao.status}
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

    if (nomePassageiro.trim() !== "") {
        const novaSolicitacao = { nomePassageiro, status: 'Em processo' };

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
            li.innerHTML = `
                ${data.nomePassageiro} - ${data.status}
                <button class="delete" onclick="excluirSolicitacao(${data.id})">Excluir</button>
            `;
            lista.appendChild(li);

            // Limpar o campo de entrada
            document.getElementById("nomePassageiro").value = '';
        })
        .catch(error => console.error('Erro ao adicionar solicitação:', error));
    } else {
        alert("Por favor, insira o nome do passageiro.");
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
        lista.removeChild(solicitacao);
    })
    .catch(error => console.error('Erro ao excluir solicitação:', error));
}

// Função para gerar solicitações fictícias
function gerarSolicitacoes() {
    const solicitacoes = [
        { nomePassageiro: "João Silva", status: "Em processo" },
        { nomePassageiro: "Maria Oliveira", status: "Em processo" },
        { nomePassageiro: "Carlos Souza", status: "Em processo" },
        { nomePassageiro: "Ana Pereira", status: "Em processo" },
        { nomePassageiro: "Pedro Costa", status: "Em processo" }
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
            li.innerHTML = `
                ${data.nomePassageiro} - ${data.status}
                <button class="delete" onclick="excluirSolicitacao(${data.id})">Excluir</button>
            `;
            lista.appendChild(li);
        })
        .catch(error => console.error('Erro ao gerar solicitações:', error));
    });
}

// Carregar as solicitações ao iniciar a página
document.addEventListener('DOMContentLoaded', carregarSolicitacoes);
