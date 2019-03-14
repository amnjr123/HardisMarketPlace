<jsp:include page="header.jsp"/>
<link href="./css/custom/signin.css" rel="stylesheet">
</head>
<body class="text-center">
    <form class="form-signin">
        <img class="mb-4" src="./assets/baseline-person-24px.svg" alt="" width="72" height="72">
        <h1 class="h3 mb-3 font-weight-normal">Connectez vous</h1>
        <label for="inputEmail" class="sr-only">Email</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">Mot de passe</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="mot de passe" required>
        <p>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Se connecter</button>
        </p>
        <p><a href="./signup.jsp">Créer un compte</a></p>

        <button type="button" class="btn btn-link" data-toggle="modal" data-target="#exampleModal">
            Mot de passe oublié
        </button>

        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        test
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary">Save changes</button>
                    </div>
                </div>
            </div>
        </div>

    </form>
    <jsp:include page="footer.jsp"/>