<jsp:include page="header.jsp"/>
<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
    <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
        <h1 class="h2">Entreprises</h1>
    </div>

    <div class="card">
        <div class="card-header">
            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center">
                <h1 class="h2">Entreprises</h1>
                <div class="btn-toolbar mb-2 mb-md-0">
                    <button  class="btn btn-sm btn-success" data-toggle="modal" data-target="#exampleModal">
                        <span data-feather="plus"></span>
                        Nouvelle entreprise
                    </button>
                </div>
            </div>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table">
                    <caption>Liste des entreprises </caption>
                    <thead>
                        <tr>
                            <th scope="col">id</th>
                            <th scope="col">SIRET</th>
                            <th scope="col">Nom</th>
                            <th scope="col">Clé de rattachement</th>
                            <th scope="col"></th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <th scope="row">1</th>
                            <td>15422651475448</td>
                            <td>Orange</td>
                            <td>f5fz651t51j65gh</td>
                            <td><div class="dropdown">
                                    <button class="btn btn-primary btn-sm dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        Action
                                    </button>
                                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                        <a class="dropdown-item" href="#"><i data-feather="edit-2"></i> Modifier</a>
                                        <a class="dropdown-item" href="#"><i data-feather="trash-2"></i> Supprimmer</a>
                                    </div>
                                </div></td>

                        </tr>
                        <tr>
                            <th scope="row">2</th>
                            <td>95448575236144</td>
                            <td>Coeur de blé</td>
                            <td>6f6ds6f5h5y55yj</td>
                            <td>
                                <div class="dropdown">
                                    <button class="btn btn-primary btn-sm dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        Action
                                    </button>
                                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                        <a class="dropdown-item" href="#"><i data-feather="edit-2"></i> Modifier</a>
                                        <a class="dropdown-item" href="#"><i data-feather="trash-2"></i> Supprimmer</a>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <th scope="row">3</th>
                            <td>11546544142845</td>
                            <td>Roya</td>
                            <td>4c4c44d54s5gk8y</td>
                            <td>
                                <div class="dropdown">
                                    <button class="btn btn-primary btn-sm dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        Action
                                    </button>
                                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                        <a class="dropdown-item" href="#"><i data-feather="edit-2"></i> Modifier</a>
                                        <a class="dropdown-item" href="#"><i data-feather="trash-2"></i> Supprimmer</a>
                                    </div>
                                </div>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Nouvelle entreprise</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    </button>
                </div>
                <div class="modal-body">
                    <p>
                        <label for="siret" class="sr-only">SIRET *</label>
                        <input type="text" id="siret" class="form-control" placeholder="SIRET" required autofocus>
                    </p>
                    <p>
                        <label for="nom" class="sr-only">Nom *</label>
                        <input type="text" id="nom" class="form-control" placeholder="Nom" required autofocus>
                    </p>
                    <p>
                        <label for="adresse" class="sr-only">Adresse de facturation *</label>
                        <input type="text" id="adresse" class="form-control" placeholder="Adresse" required autofocus>
                    </p>
                    <p>
                    <div class="input-group mb-3">

                        <label for="cle" class="sr-only">Clé de rattachement *</label>
                        <input type="text" id="cle" class="form-control" placeholder="Clé de rattachement" disabled="true" required autofocus>
                        <div class="input-group-prepend">
                            <a href="#" type="button" class="btn btn-primary"><i data-feather="refresh-ccw"></i></a>
                        </div>
                    </div>

                    </p>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Fermer</button>
                    <button type="button" class="btn btn-primary">Créer l'entreprise</button>
                </div>
            </div>
        </div>
    </div>
</main>


<jsp:include page="footer.jsp"/>