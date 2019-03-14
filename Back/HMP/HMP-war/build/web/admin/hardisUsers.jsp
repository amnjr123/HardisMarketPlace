<div class="card">
    <div class="card-header">
        <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center">
            <h1 class="h2">Utilisateurs HARDIS</h1>
            <div class="btn-toolbar mb-2 mb-md-0">
                <button  class="btn btn-sm btn-success" data-toggle="modal" data-target="#exampleModal">
                    <span data-feather="plus"></span>
                    Nouvel utilisateur
                </button>
            </div>
        </div>
    </div>
    <div class="card">
        <div class="card-body">
            <div class="row">
                <div class="col-md-6 mb-3">
                    <div class="input-group mb-3">

                        <label for="nom" class="sr-only">Rechercher</label>
                        <input type="text" id="nom" class="form-control" placeholder="Nom, pr�nom, identifiant ou email" required autofocus>
                        <div class="input-group-prepend">
                            <a href="#" type="button" class="btn btn-primary"><i data-feather="search"></i></a>
                        </div>

                    </div>
                </div>

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
                        <th scope="col">Nom</th>
                        <th scope="col">Email</th>
                        <th scope="col">T�l�phone</th>
                        <th scope="col">Profil technique</th>
                        <th scope="col">Activit�</th>
                        <th scope="col">Plafond de d�l�gation</th>
                        <th scope="col">Type</th>
                        <th scope="col"></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <th scope="row">1</th>
                        <td>NEJJARI Amine</td>
                        <td>amnjr123@gmail.com</td>
                        <td>06 24 31 88 57</td>
                        <td>Administrateur</td>
                        <td><i data-feather="check" style="color :#34ce57"></i><i data-feather="x" style="color :#bd2130"></i><i data-feather="minus" style="color :#d39e00"></i></td>
                        <td>10 000 EUR</td>
                        <td>Consultant</td>
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

                </tbody>
            </table>
        </div>
        <nav aria-label="...">
            <ul class="pagination">
                <li class="page-item disabled">
                    <a class="page-link" href="#" tabindex="-1">Pr�c�dent</a>
                </li>
                <li class="page-item"><a class="page-link" href="#">1</a></li>
                <li class="page-item active">
                    <a class="page-link" href="#">2 <span class="sr-only">(current)</span></a>
                </li>
                <li class="page-item"><a class="page-link" href="#">3</a></li>
                <li class="page-item">
                    <a class="page-link" href="#">Suivant</a>
                </li>
            </ul>
        </nav>
    </div>
</div>

<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Nouvel utilisateur HARDIS</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                </button>
            </div>
            <div class="modal-body">
                <p>
                    <label for='siret' class='sr-only'>Nom</label>
                    <input type='text' id='Nom' class='form-control' placeholder='Nom' required autofocus>
                </p>
                <p>
                    <label for='siret' class='sr-only'>Prenom</label>
                    <input type='text' id='Prenom' class='form-control' placeholder='Prenom' required autofocus>
                </p>
                <p>
                    <label for='siret' class='sr-only'>Email</label>
                    <input type='text' id='Email' class='form-control' placeholder='Email' required autofocus>
                </p>
                <p>
                    <label for='siret' class='sr-only'>Telephone</label>
                    <input type='text' id='Telephone' class='form-control' placeholder='Telephone' required autofocus>
                </p>
                <div class="input-group mb-3">
                    <select class="custom-select" id="inputGroupSelect01">
                        <option selected>Profil Technique</option>
                        <option value="1">Administrateur</option>
                        <option value="2">Gestionnaire</option>
                        <option value="3">Visualisation</option>
                    </select>
                </div>
                <div class="input-group mb-3">
                    <select class="custom-select" id="inputGroupSelect01">
                        <option selected>Avtivit�</option>
                        <option value="1">Actif</option>
                        <option value="2">Inactif</option>
                        <option value="3">?</option>
                    </select>
                </div>
                
                <p>
                    <label for='siret' class='sr-only'>Plafond de d�l�guation</label>
                    <input type='text' id='Plafond de d�l�guation' class='form-control' placeholder='Plafond de d�l�guation' required autofocus>
                </p>
                
                <div class="input-group mb-3">
                    <select class="custom-select" id="inputGroupSelect01">
                        <option selected>Type</option>
                        <option value="1">R�f�rant local</option>
                        <option value="2">Porteur d'offre</option>
                        <option value="3">Consultant</option>
                    </select>
                </div>
                

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Fermer</button>
                <button type="button" class="btn btn-primary">Cr�er l'utilisateur</button>
            </div>
        </div>
    </div>

</div>