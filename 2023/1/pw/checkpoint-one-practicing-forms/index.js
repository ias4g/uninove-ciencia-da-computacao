function openTab(evt, tabName) {
  // Obter todos os elementos com class="tab-content" e ocultá-los
  let tabContent = document.getElementsByClassName("tab-content");
  for (let i = 0; i < tabContent.length; i++) {
    tabContent[i].style.display = "none";
  }

  // Obter todos os elementos com class="tab-btn" e remover a classe "active"
  let tabBtn = document.getElementsByClassName("tab-btn");
  for (let i = 0; i < tabBtn.length; i++) {
    tabBtn[i].classList.remove("active");
  }

  // Exibir o conteúdo da tab atual e marcar o botão como ativo
  document.getElementById(tabName).style.display = "block";
  evt.currentTarget.classList.add("active");
}
