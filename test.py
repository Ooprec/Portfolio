import tkinter as tk

def myFunction():
    # You can add functionality for your function here
    print("myFunction() was called")

# Create the main window
window = tk.Tk()

# Set window title
window.title("My Window")

# Create a button that calls myFunction when clicked
button = tk.Button(window, text="Click me!", command=myFunction)
button.pack(pady=20)

# Run the Tkinter event loop
window.mainloop()
