function abrir_modal(){
    let modal = document.querySelector('.modal')
    let janela_escura = document.querySelector('.janela_escura')

    modal.style.visibility = 'visible';
    janela_escura.style.visibility = 'visible';
}
function fechar_modal(){
    let modal = document.querySelector('.modal')
    let janela_escura = document.querySelector('.janela_escura')

    modal.style.visibility = 'hidden';
    janela_escura.style.visibility = 'hidden';
}