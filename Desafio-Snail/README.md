<h1>Desafio: Snail (Caracol)</h1>
    <h2>Construção do Código</h2>
    <p>Este código resolve o problema do "Snail" (ou caracol), onde a matriz é percorrida em um padrão de espiral, da borda externa para o centro. O código retorna os valores da matriz em uma lista conforme o padrão de espiral é seguido.</p>
    
    <h2>Lógica Utilizada</h2>
    <p>A lógica central para o padrão caracol segue um ciclo de quatro etapas principais, repetindo até que todos os elementos da matriz tenham sido visitados:</p>
    
    <h3>1. Movimento da Esquerda para a Direita (Topo da Matriz)</h3>
    <p>O código começa percorrendo a linha superior da matriz, movendo-se da esquerda para a direita, e adiciona esses elementos à lista de resultados.</p>
    
    <h3>2. Movimento de Cima para Baixo (Lado Direito da Matriz)</h3>
    <p>Após o topo ser processado, o código move-se para a direita e percorre a coluna mais à direita de cima para baixo, adicionando os elementos à lista de resultados.</p>
    
    <h3>3. Movimento da Direita para a Esquerda (Base da Matriz)</h3>
    <p>Em seguida, se houver linhas restantes, o código processa a linha inferior da matriz da direita para a esquerda.</p>
    
    <h3>4. Movimento de Baixo para Cima (Lado Esquerdo da Matriz)</h3>
    <p>Por último, se houver colunas restantes, o código percorre a coluna mais à esquerda de baixo para cima, completando um ciclo em volta da borda externa da matriz.</p>
    
    <p>O processo então se repete, mas agora para a "submatriz" interna, até que todos os elementos tenham sido processados.</p>
    
    <h2>Exemplo de Entrada e Saída</h2>
    <ul>
        <li>Entrada: <code>matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}</code></li>
        <li>Saída: <code>[1, 2, 3, 6, 9, 8, 7, 4, 5]</code></li>
    </ul>