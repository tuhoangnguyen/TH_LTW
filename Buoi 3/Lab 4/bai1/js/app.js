//Cách 1 
// function changeBackground(color) {
//     const buttons = document.getElementsByClassName("button");
//     for (let i = 0; i < buttons.length; i++) {
//       buttons[i].style.backgroundColor = color;
//     }
//   }

// Cách 2
function changeBackground(color) {
    document.body.style.backgroundColor = color;
}