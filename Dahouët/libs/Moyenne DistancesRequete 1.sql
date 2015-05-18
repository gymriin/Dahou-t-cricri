select regate.Num_regate,regate.Num_challenge ,
 
(sum( participation.Distance_parcourue)) / (  count(participation.Num_regate)) as moyenne_regates from participation 
inner join regate on participation.Num_regate=regate.Num_regate
where participation.Statut != 'A'
group by participation.Num_regate