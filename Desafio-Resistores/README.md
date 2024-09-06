 <h1>Desafio: Resistores</h1>
    <h2>Construção do Código</h2>
    <p>Este código foi desenvolvido para converter o valor de resistores em cores, conforme o padrão de resistores elétricos. Ele aceita valores em "ohms", "k ohms" ou "M ohms", interpreta o valor numérico e converte os dois primeiros dígitos e o multiplicador em cores correspondentes.</p>
    
    <h2>Lógica Utilizada</h2>
    <p>A lógica principal consiste em três etapas:</p>
    
    <h3>1. Mapeamento de Cores</h3>
    <p>O código usa um <code>Map</code> para associar cada dígito a uma cor correspondente. O mapa é construído usando <code>Map.of</code> e mapeia os números de 0 a 9 para as respectivas cores (preto, marrom, vermelho, etc.).</p>
    
    <h3>2. Análise do Valor</h3>
    <p>A função <code>parseValue()</code> processa o valor de entrada (como "47 ohms", "4.7k ohms", ou "1M ohms"). Se o valor contiver "k" ou "M", ele ajusta o valor para representar "kilo" ou "mega" multiplicando por 1000 ou 1.000.000, respectivamente.</p>
    
    <h3>3. Extração dos Dígitos</h3>
    <p>A função <code>extractDigits()</code> extrai os dois primeiros dígitos do valor do resistor e o número de zeros que seguem esses dígitos (o multiplicador). Esses valores são usados para buscar as cores correspondentes no <code>colorMap</code>.</p>
    
    <h2>Exemplos de Entrada e Saída</h2>
    <ul>
        <li>Entrada: <code>"47 ohms"</code> - Saída: "amarelo violeta preto dourado"</li>
        <li>Entrada: <code>"4.7k ohms"</code> - Saída: "amarelo violeta marrom dourado"</li>
        <li>Entrada: <code>"1M ohms"</code> - Saída: "marrom preto verde dourado"</li>
    </ul>