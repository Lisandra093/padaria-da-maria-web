const formContato = document.getElementById("formContato");

if (formContato) {

    formContato.addEventListener("submit", async function(event) {

        event.preventDefault();

        // Verifica se todos os campos obrigatórios
        // foram preenchidos corretamente

        if (!formContato.checkValidity()) {

            event.stopPropagation();

            formContato.classList.add("was-validated");

            return;
        }

            const contato = {
                nome: document.getElementById("nome").value,
                email: document.getElementById("email").value,
                telefone: document.getElementById("telefone").value,
                mensagem: document.getElementById("mensagem").value
        };

        try {
            const resposta = await fetch("http://localhost:8081/api/contato", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(contato)
            });

            if (!resposta.ok) {
                throw new Error("Erro ao enviar mensagem.");
            }

        alert(
            "Mensagem enviada com sucesso! " +
            "Em breve entraremos em contato."
        );

        // Limpa o formulário

        formContato.reset();

        formContato.classList.remove("was-validated");

         } catch (erro) {

            console.error("Erro:", erro);

            alert(
                "Não foi possível enviar sua mensagem. " +
                "Verifique se o sistema está funcionando."
            );
        }

    });

}

