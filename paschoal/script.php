<?php
$login= $_Post['login'];
$Senha= $_Post['Senha'];
    if($login==123  &&  $Senha==123){    

        header ('location:galeria.html');
    }
    else{ 
        header('location:index.html');
    }

?>