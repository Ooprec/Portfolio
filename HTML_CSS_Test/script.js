document.addEventListener('DOMContentLoaded', function () {
    const root = document.documentElement;
    const button = document.getElementById('funButton');

    button.addEventListener('mousedown', function () {
        root.style.setProperty('--funButton-color', 'var(--button-down)');
    });

    button.addEventListener('mouseup', function () {
        root.style.setProperty('--funButton-color', 'var(--light)');
    });
});