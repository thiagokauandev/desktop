from PIL import Image
import numpy as np
import matplotlib.pyplot as plt
import tkinter as tk
from tkinter import filedialog
import sys

root = tk.Tk()
root.withdraw()
image_path = filedialog.askopenfilename(
    title="Selecione a imagem",
    filetypes=[
        ("Imagens", "*.png *.jpg *.jpeg *.bmp *.tif *.tiff"),
        ("Todos os arquivos", "*.*"),
    ],
)
root.destroy()

if not image_path:
    print("Nenhuma imagem foi selecionada.")
    sys.exit(0)

img = Image.open(image_path).convert('L')
arr = np.array(img).astype(np.uint8)
print(f"Valor mínimo dos pixels: {arr.min()}")
print(f"Valor máximo dos pixels: {arr.max()}")
print(f"Valor médio dos pixels: {arr.mean():.2f}\n")
plt.ion()
fig, ax = plt.subplots()
out = np.where(arr >= 0, 255, 0).astype(np.uint8)
im = ax.imshow(out, cmap='gray', vmin=0, vmax=255)
ax.axis('off')
min_limiar = int(arr.min())
max_limiar = int(arr.max())
for limiar in range(min_limiar, max_limiar + 1):
    out = np.where(arr >= limiar, 255, 0).astype(np.uint8)
    im.set_data(out)
    ax.set_title(f"Limiar = {limiar}")
    plt.pause(0.05)
plt.ioff()
plt.show()