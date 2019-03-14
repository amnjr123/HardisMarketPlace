<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>nomClient</title>

    <link href="./../css/bootstrap.min.css" rel="stylesheet">

    <link href="./../css/custom/dashboard.css" rel="stylesheet">
  </head>

  <body>
    <nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0">
      <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">Hardis Work Place</a>
      <input class="form-control form-control-dark w-100" type="text" placeholder="Search" aria-label="Search">
      <ul class="navbar-nav px-3">
        <li class="nav-item text-nowrap">
          <a class="nav-link" href="#">Se déconnecter <span data-feather="log-out"></span> </a>
        </li>
      </ul>
    </nav>

    <div class="container-fluid">
      <div class="row">
        <nav class="col-md-2 d-none d-md-block bg-light sidebar">
          <div class="sidebar-sticky">
            <ul class="nav flex-column" id="myTab" >
              <li class="nav-item">
                <a class="nav-link active" href="#">
                  <span data-feather="home"></span>
                  Menu
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link active" href="indexClient.jsp">
                  <span data-feather="monitor"></span>
                  Tableau de bord <span class="sr-only">(current)</span>
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="monProfil.jsp">
                  <span data-feather="user"></span>
                  Mon profil
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="devis.jsp">
                  <span data-feather="file-text"></span>
                  Devis
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="commandes.jsp">
                  <span data-feather="shopping-cart"></span>
                  Commandes
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="factures.jsp">
                  <span data-feather="square"></span>
                  Factures
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="calendrier.jsp">
                  <span data-feather="calendar"></span>
                  Calendrier
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="inbox.jsp">
                  <span data-feather="inbox"></span>
                  Inbox
                </a>
              </li>
            </ul>

            <h6 class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted">
              <span>Récent</span>
              <a class="d-flex align-items-center text-muted" href="#">
                <span data-feather="plus-circle"></span>
              </a>
            </h6>
            <ul class="nav flex-column mb-2">
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="file-text"></span>
                  Devis roya
                </a>
              </li>

            </ul>
          </div>
        </nav>
          