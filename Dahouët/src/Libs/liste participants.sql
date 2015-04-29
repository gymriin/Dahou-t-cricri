select membre_equipage.Licence,membre_equipage.Nom_membre,regate.Num_regate,regate.Date_regate,participation.Num_skipper,voilier.Nom_voilier from membre_equipage
inner join participation on membre_equipage.Num_membre=participation.Num_skipper
inner join regate on participation.Num_regate=regate.Num_regate
inner join voilier on participation.Num_voile=voilier.Num_voile




