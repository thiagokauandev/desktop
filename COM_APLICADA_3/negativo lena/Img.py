from PIL import Image
import numpy as np
import matplotlib.pyplot as plt

# Este script gera o NEGATIVO de uma imagem.

# Ideia principal: uma imagem digital é feita de pequenos pontos
# chamados pixels. Cada pixel tem um valor que representa sua cor. Em imagens
# comuns de 8 bits por canal, esses valores vão de 0 (preto) a 255 (branco).
# Fazer o negativo significa inverter cada valor: 0 vira 255, 255 vira 0,
# e valores intermediários são espelhados.

# 1) Abrir a imagem no disco em tons de cinza (modo 'L') usando Pillow
#    - O método `convert('L')` força a imagem para escala de cinza
#    - Substitua "lena.bmp" por outro caminho, se necessário.
img = Image.open("/home/thiago/Documentos/COM_APLICADA/negativo lena/lena.bmp").convert('L')

# 2) Converter a imagem para um array NumPy
#    - Internamente, isso transforma a imagem em uma matriz de números.
#    - Para uma imagem colorida, o formato costuma ser (altura, largura, 3),
#      onde os 3 valores representam as componentes R, G e B.
arr = np.array(img)

# 3) Calcular o negativo
#    - Para imagens de 8 bits usamos a fórmula simples: negativo = 255 - valor.
#    - Isso subtrai cada componente de cor de 255, invertendo brilho/cores.
neg = 255 - arr

# 4) Garantir o tipo de dados correto
#    - Depois da operação, forçamos o tipo para "uint8" (inteiro de 8 bits)
#      para que os valores fiquem no intervalo 0..255 e possam ser exibidos/salvos.
arr = neg.astype(np.uint8)

# 5) Mostrar o resultado
#    - Usamos matplotlib para exibir a imagem em uma janela.
#    - Observação: se a imagem for em tons de cinza,
#      usar cmap='gray' em plt.imshow para visualizar corretamente.
plt.title("Negativo")
plt.imshow(neg, cmap='gray', vmin=0, vmax=255)
plt.show()