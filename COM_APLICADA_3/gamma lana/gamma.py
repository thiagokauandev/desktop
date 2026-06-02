from PIL import Image
import numpy as np
import matplotlib.pyplot as plt

# Este script aplica uma correção GAMA a uma imagem.

# Ideia principal: a correção gama ajusta o brilho percebido
# de uma imagem aplicando uma transformação não-linear aos valores dos pixels.
# Primeiro normalizamos os valores para 0..1, aplicamos a potência (valor**gamma),
# e então escalamos de volta para 0..255.

# Exemplos de gamma:
#  - gamma < 1 (ex: 0.5) deixa a imagem mais clara
#  - gamma = 1 deixa a imagem inalterada
#  - gamma > 1 (ex: 2.0) deixa a imagem mais escura

# 1) Abrir a imagem no disco em tons de cinza (modo 'L') usando Pillow
#    - O método `convert('L')` força a imagem para escala de cinza
#    - Substitua "lena.bmp" por outro caminho, se necessário.
img = Image.open("/home/thiago/Documentos/COM_APLICADA/gamma lana/lena.bmp").convert('L')

# 2) Converter a imagem para um array NumPy
#    - Convertendo para float, podemos aplicar a operação de potência (gamma)
#      sem perder precisão.
arr = np.array(img).astype(np.float32)

# 3) Ler o valor de gamma do usuário
#    - Pedimos ao usuário que digite um número real maior que 0.
#    - Se o usuário pressionar Enter sem digitar nada, usamos gamma = 1.0
s = input("Digite o valor de gamma: ").strip()
try:
    gamma = float(s)
except ValueError:
    print("Entrada inválida.")
    exit(1)

if gamma <= 0:
    print("Gamma deve ser um número maior que 0.")
    exit(1)

# 4) Aplicar a correção gama
#    - Normalizamos para 0..1 dividindo por 255,
#      aplicamos a potência e depois voltamos para 0..255.
norm = arr / 255.0
corrected = 255.0 * np.power(norm, gamma)

# 5) Garantir que os valores estão no intervalo válido e no tipo correto
out = np.clip(corrected, 0, 255).astype(np.uint8)

# 6) Mostrar o resultado
plt.title(f"Gamma = {gamma}")
plt.imshow(out, cmap='gray', vmin=0, vmax=255)
plt.show()