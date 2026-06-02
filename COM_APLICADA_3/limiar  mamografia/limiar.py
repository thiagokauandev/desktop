from PIL import Image
import numpy as np
import matplotlib.pyplot as plt

# Este script aplica uma limiarização (thresholding) a uma imagem em tons de cinza.

# Ideia principal: thresholding transforma a imagem em preto e branco
# binária. Você escolhe um valor de limiar entre 0 e 255. Todos os pixels com
# valor maior ou igual ao limiar ficam brancos (255) e os menores ficam pretos (0).
# Exemplo: limiar = 128 -> pixels claros viram branco, escuros viram preto.

# 1) Abrir a imagem no disco em tons de cinza (modo 'L') usando Pillow
#    - O método `convert('L')` força a imagem para escala de cinza
#    - Substitua "lena.bmp" por outro caminho, se necessário.
img = Image.open("/home/thiago/Documentos/COM_APLICADA/limiar  mamografia/mamografia.jpg").convert('L')

# 2) Converter a imagem para um array NumPy
#    - Usamos uint8 porque cada pixel tem valor inteiro 0..255
arr = np.array(img).astype(np.uint8)

# 3) Escrever o valor mínimo, máximo e médio dos pixels para ajudar o usuário a escolher um limiar
print(f"Valor mínimo dos pixels: {arr.min()}")
print(f"Valor máximo dos pixels: {arr.max()}")
print(f"Valor médio dos pixels: {arr.mean():.2f}\n")

# 4) Ler o valor do limiar do usuário
#    - Pedimos um inteiro entre 0 e 255.
#    - Se o usuário pressionar Enter sem digitar nada, usamos limiar = 128
#    - Se a entrada for inválida, encerramos o programa com `exit()`.
s = input("Digite o valor do limiar (0-255): ").strip()
try:
    limiar = int(s)
except ValueError:
    print("Entrada inválida. Digite um inteiro entre 0 e 255.")
    exit(1)

if not(0 <= limiar <= 255):
    print("Valor fora do intervalo 0..255.")
    exit(1)

# 5) Aplicar o limiar
#    - Pixels com valor >= limiar tornam-se 255 (branco), caso contrário 0 (preto).
out = np.where(arr >= limiar, 255, 0).astype(np.uint8)

# 6) Mostrar o resultado
#    - Exibimos a imagem binária com mapa de cor 'gray'.
plt.title(f"Limiar = {limiar}")
plt.imshow(out, cmap='gray', vmin=0, vmax=255)
plt.show()

