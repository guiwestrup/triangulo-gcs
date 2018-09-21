##Atividade para aula de gerenciamento de configuração de software
Código fonte implementado

###Complexidade Sintomática

A complexidade sintomática faz você analisar o código para verificar todos os caminhos que são tomados.

Para evitar que tenha um código com uso excessivo de estruturas condicionais.

Existem algumas ferramentas que auxiliam na verificação, como o [Sonar](https://www.sonarqube.org/).

####Parâmetros aceitáveis

<table>
    <thead>
        <th>
            Complexidade
        </th>
        <th>
            Avaliação
        </th>
    </thead>
    <tbody>
        <tr>
            <td>
                1-10
            </td>
            <td>
                Método simples. <strong>Baixo Risco</strong>.
            </td>
        </tr>
        <tr>
            <td>
                11-20
            </td>
            <td>
                Método razoavelmente complexo. <strong>Moderado risco</strong>.
            </td>
        </tr>
        <tr>
            <td>
                21-50
            </td>
            <td>
                Método muito complexo. <strong>Elevado risco</strong>.
            </td>
        </tr>
        <tr>
            <td>
                51-N
            </td>
            <td>
                Método de <strong>Altíssimo risco</strong> e bastante instável.
            </td>
        </tr>
    </tbody>
</table>

Essa tabela é uma referência apenas. Ter um baixo risco não quer dizer que o código não possa ser melhorado.