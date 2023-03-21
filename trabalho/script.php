<?php
$login= $_POST['login'];
$senha= $_POST['senha'];
    if($login==123  &&  $senha==123){    

        header ('Location:galeira.html');
    }
    else{ 
        header('Location:index.html');
    }

?>