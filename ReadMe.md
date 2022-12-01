# Exercice : DAB

Créer une interface qui permet à un client de
pouvoir retirer de l’argent, déposer de
l’argent, consulter ses comptes et déposer un
chèque

Créer une classe d’implémentation de cette
interface qui répond à ces services

## conception

Interface ClientInterface 
  bool makeDeposit 
  Double makeWithdraw
  Double verifyAmount

Class Client 
  String name
  deposit 
  transaction
  getter 
  setter

Class Account
  Double amount 
  Client client
  getter 
  setter

Class espèce
  Double amount
  getter 
  setter

Class chèque 
  Double amount
  getter 
  setter

<!-- ######## NON ####### -->

<!-- Class transaction 
  constructor 
    Transaction(Check amount)
    Transaction(Cash amount)
  String transactionName
  Double amount 
  date 
  check num
  typeDeposit

  getters 
  setters  -->
