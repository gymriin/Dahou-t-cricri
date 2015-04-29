select commissaire.Nom_commissaire,commissaire.Comite,regate.Date_regate,regate.Num_regate from regate
inner join commissaire on regate.Num_commissaire=commissaire.Num_commissaire
where regate.Date_regate>=(substr(now(),1, 10))