package com.example.exercice_1.activity

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.exercice_1.R

class CguActivity : AppCompatActivity() {
    fun confirmDialog(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Confirmation")
        builder.setMessage("Are you sure you want to ...")
        builder.setPositiveButton("Yes"){dialog, which ->
            Toast.makeText(applicationContext, "Followed", Toast.LENGTH_LONG).show()
            Toast.makeText(this, "Followed", Toast.LENGTH_LONG).show()
            finish()
        }
        builder.setNegativeButton("No"){dialog, which ->
            Toast.makeText(applicationContext, "Cancelled", Toast.LENGTH_LONG).show()
        }
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cgu)

        val cguTextView = findViewById<TextView>(R.id.cgu_text)

        findViewById<Button>(R.id.validate_cgu_btn).setOnClickListener {
            confirmDialog()
        }

        cguTextView.setText("Conditions générales d’utilisation du site internet et des services proposés\n" +
                "L’utilisation du site https://fr.orson.io implique l’acceptation pleine et entière des conditions générales d’utilisation ci-après décrites. Ces conditions d’utilisation sont susceptibles d’être modifiées ou complétées à tout moment, les utilisateurs du site https://fr.orson.io sont donc invités à les consulter de manière régulière.\n" +
                "\n" +
                "Ce site est normalement accessible à tout moment aux utilisateurs. Une interruption pour raison de maintenance technique peut être toutefois décidée par https://fr.orson.io qui s’efforcera alors de communiquer préalablement aux utilisateurs les dates et heures de l’intervention.\n" +
                "\n" +
                "Le site https://fr.orson.io est mis à jour régulièrement par Orson. De la même façon, les mentions légales peuvent être modifiées à tout moment : elles s’imposent néanmoins à l’utilisateur qui est invité à s’y référer le plus souvent possible afin d’en prendre connaissance.\n" +
                "\n" +
                "Description des services fournis\n" +
                "Le site https://fr.orson.io a pour objet de fournir une information concernant l’ensemble des activités de la société.\n" +
                "\n" +
                "Orson s’efforce de fournir sur le site https://fr.orson.io des informations aussi précises que possible. Toutefois, il ne pourra être tenu responsable des omissions, des inexactitudes et des carences dans la mise à jour, qu’elles soient de son fait ou du fait des tiers partenaires qui lui fournissent ces informations.\n" +
                "\n" +
                "Toutes les informations indiquées sur le site https://fr.orson.io sont données à titre indicatif, et sont susceptibles d’évoluer. Par ailleurs, les renseignements figurant sur le site https://fr.orson.io ne sont pas exhaustifs. Ils sont donnés sous réserve de modifications ayant été apportées depuis leur mise en ligne.\n" +
                "\n" +
                "Limitations contractuelles sur les données techniques\n" +
                "Le site utilise la technologie JavaScript.\n" +
                "\n" +
                "Le site Internet ne pourra être tenu responsable de dommages matériels liés à l’utilisation du site. De plus, l’utilisateur du site s’engage à accéder au site en utilisant un matériel récent, ne contenant pas de virus et avec un navigateur de dernière génération mis à jour.\n" +
                "\n" +
                "Le site https://fr.orson.io est hébergé chez un prestataire sur le territoire de l’Union Européenne conformément aux dispositions du Règlement Général sur la Protection des Données (RGPD : n° 2016-679)\n" +
                "\n" +
                "L’objectif est d’apporter une prestation qui assure le meilleur taux d’accessibilité. L’hébergeur assure la continuité de son service 24 Heures sur 24, tous les jours de l’année. Il se réserve néanmoins la possibilité d’interrompre le service d’hébergement pour les durées les plus courtes possibles notamment à des fins de maintenance, d’amélioration de ses infrastructures, de défaillance de ses infrastructures ou si les Prestations et Services génèrent un trafic réputé anormal.\n" +
                "\n" +
                "https://fr.orson.io et l’hébergeur ne pourront être tenus responsables en cas de dysfonctionnement du réseau Internet, des lignes téléphoniques ou du matériel informatique et de téléphonie lié notamment à l’encombrement du réseau empêchant l’accès au serveur.\n" +
                "\n" +
                "Propriété intellectuelle et contrefaçons\n" +
                "Orson est propriétaire des droits de propriété intellectuelle ou détient les droits d’usage sur tous les éléments accessibles sur le site, notamment les textes, images, graphismes, logo, icônes, sons, logiciels.\n" +
                "\n" +
                "Toute reproduction, représentation, modification, publication, adaptation de tout ou partie des éléments du site, quel que soit le moyen ou le procédé utilisé, est interdite, sauf autorisation écrite préalable de : Orson.\n" +
                "\n" +
                "Toute exploitation non autorisée du site ou de l’un quelconque des éléments qu’il contient sera considérée comme constitutive d’une contrefaçon et poursuivie conformément aux dispositions des articles L.335-2 et suivants du Code de Propriété Intellectuelle.\n" +
                "\n" +
                "Limitations de responsabilité\n" +
                "Orson ne pourra être tenue responsable des dommages directs et indirects causés au matériel de l’utilisateur, lors de l’accès au site Orson, et résultant soit de l’utilisation d’un matériel ne répondant pas aux spécifications indiquées au point 4, soit de l’apparition d’un bug ou d’une incompatibilité.\n" +
                "\n" +
                "Orson ne pourra également être tenue responsable des dommages indirects (tels par exemple qu’une perte de marché ou perte d’une chance) consécutifs à l’utilisation du site https://fr.orson.io\n" +
                "\n" +
                "Des espaces interactifs (possibilité de poser des questions dans l’espace contact) sont à la disposition des utilisateurs. Orson se réserve le droit de supprimer, sans mise en demeure préalable, tout contenu déposé dans cet espace qui contreviendrait à la législation applicable en France, en particulier aux dispositions relatives à la protection des données. Le cas échéant, Orson se réserve également la possibilité de mettre en cause la responsabilité civile et/ou pénale de l’utilisateur, notamment en cas de message à caractère raciste, injurieux, diffamant, ou pornographique, quel que soit le support utilisé (texte, photographie…).\n" +
                "\n" +
                "Gestion des données personnelles\n" +
                "Le Client est informé des réglementations concernant la communication marketing, la loi du 21 Juin 2014 pour la confiance dans l’Economie Numérique, la Loi Informatique et Liberté du 06 Août 2004 ainsi que du Règlement Général sur la Protection des Données (RGPD : n° 2016-679).\n" +
                "\n" +
                "Responsable de la collecte des données personnelles (DPO)\n" +
                "Pour les Données Personnelles collectées dans le cadre de la création du compte personnel de l’Utilisateur et de sa navigation sur le Site, le responsable du traitement des Données Personnelles (DPO) est : SAS SiteW.com\n" +
                "\n" +
                "En tant que responsable du traitement des données qu’il collecte, Orson s’engage à respecter le cadre des dispositions légales en vigueur. Il lui appartient notamment d’établir les finalités de ses traitements de données, de fournir à ses prospects et clients, à partir de la collecte de leurs consentements, une information complète sur le traitement de leurs données personnelles et de maintenir un registre des traitements conforme à la réalité.\n" +
                "\n" +
                "Chaque fois que Orson traite des Données Personnelles, Orson prend toutes les mesures raisonnables pour s’assurer de l’exactitude et de la pertinence des Données Personnelles au regard des finalités pour lesquelles Orson les traite. \n" +
                "\n" +
                "Finalité des données collectées\n" +
                "Orson est susceptible de traiter tout ou partie des données :\n" +
                "\n" +
                "pour permettre la navigation sur le Site et la gestion et la traçabilité des prestations et services commandés par l’utilisateur : données de connexion et d’utilisation du Site, facturation, historique des commandes, etc,\n" +
                "pour prévenir et lutter contre la fraude informatique (spamming, hacking…) : matériel informatique utilisé pour la navigation, l’adresse IP, le mot de passe (hashé),\n" +
                "pour améliorer la navigation sur le Site : données de connexion et d’utilisation,\n" +
                "pour mener des enquêtes de satisfaction facultatives sur Orson : adresse email,\n" +
                "pour mener des campagnes de communication (sms, mail) : numéro de téléphone, adresse email.\n" +
                "Orson ne commercialise pas vos données personnelles qui sont donc uniquement utilisées par nécessité ou à des fins statistiques et d’analyses.\n" +
                "\n" +
                "Droit d'accès, de rectification et d'opposition\n" +
                "Conformément à la réglementation européenne en vigueur, les Utilisateurs de https://fr.orson.io disposent des droits suivants :\n" +
                "\n" +
                "droit d'accès (article 15 RGPD) et de rectification (article 16 RGPD), de mise à jour, de complétude des données des Utilisateurs - droit de verrouillage ou d’effacement des données des Utilisateurs à caractère personnel (article 17 du RGPD), lorsqu’elles sont inexactes, incomplètes, équivoques, périmées, ou dont la collecte, l'utilisation, la communication ou la conservation est interdite,\n" +
                "droit de retirer à tout moment un consentement (article 13-2c RGPD),\n" +
                "droit à la limitation du traitement des données des Utilisateurs (article 18 RGPD),\n" +
                "droit d’opposition au traitement des données des Utilisateurs (article 21 RGPD),\n" +
                "droit à la portabilité des données que les Utilisateurs auront fournies, lorsque ces données font l’objet de traitements automatisés fondés sur leur consentement ou sur un contrat (article 20 RGPD),\n" +
                "droit de définir le sort des données des Utilisateurs après leur mort et de choisir à qui Orson devra communiquer (ou non) leurs données à un tiers qu’ils auront préalablement désigné.\n" +
                "Si l’Utilisateur souhaite savoir comment Orson utilise ses Données Personnelles, veut demander à les rectifier ou s’oppose à leur traitement, l’Utilisateur peut contacter Orson par écrit à l’adresse suivante :\n" +
                "\n" +
                "SAS SiteW.Com,\n" +
                "\n" +
                "6, rue de l'Élancèze\n" +
                "15800 VIC SUR CERE\n" +
                "\n" +
                "ou par mail à support orson.io\n" +
                "\n" +
                "Dans ce cas, l’Utilisateur doit indiquer les Données Personnelles qu’il souhaiterait que Orson corrige, mette à jour ou supprime, en s’identifiant précisément avec une copie d’une pièce d’identité (carte d’identité ou passeport).\n" +
                "\n" +
                "Les demandes de suppression de Données Personnelles seront soumises aux obligations qui sont imposées à Orson par la loi, notamment en matière de conservation ou d’archivage des documents. Enfin, les Utilisateurs de https://fr.orson.io peuvent déposer une réclamation auprès des autorités de contrôle, et notamment de la CNIL (https://www.cnil.fr/fr/plaintes).\n" +
                "\n" +
                "Non communication des données personnelles\n" +
                "Orson s’interdit de traiter, héberger ou transférer les Informations collectées sur ses Clients vers un pays situé en dehors de l’Union européenne ou reconnu comme « non adéquat » par la Commission européenne sans en informer préalablement le client. Pour autant, Orson reste libre du choix de ses sous-traitants techniques et commerciaux à la condition qu’il présentent les garanties suffisantes au regard des exigences du Règlement Général sur la Protection des Données (RGPD : n° 2016-679).\n" +
                "\n" +
                "Orson s’engage à prendre toutes les précautions nécessaires afin de préserver la sécurité des Informations et notamment qu’elles ne soient pas communiquées à des personnes non autorisées. Cependant, si un incident impactant l’intégrité ou la confidentialité des Informations du Client est portée à la connaissance de Orson, celle-ci devra dans les meilleurs délais informer le Client et lui communiquer les mesures de corrections prises. Par ailleurs Orson ne collecte aucune « donnée sensible ».\n" +
                "\n" +
                "Les Données Personnelles de l’Utilisateur peuvent être traitées par des filiales de Orson et des sous-traitants (prestataires de services), exclusivement afin de réaliser les finalités de la présente politique.\n" +
                "\n" +
                "Dans la limite de leurs attributions respectives et pour les finalités rappelées ci-dessus, les principales personnes susceptibles d’avoir accès aux données des Utilisateurs de https://fr.orson.io sont principalement les agents de notre service client.\n" +
                "\n" +
                "Types de données collectées\n" +
                "Concernant les utilisateurs d’un Site https://fr.orson.io , nous collectons les données suivantes qui sont indispensables au fonctionnement du service , et qui seront conservées pendant une période maximale de dix huit (18) mois après la fin de la relation contractuelle:\n" +
                "\n" +
                "Coordonnées (titre, nom, prénom, adresse, téléphone, date de naissance, email de contact, nom de la société, langue de contact),\n" +
                "Statut ( visiteur, prospect, client),\n" +
                " Images, adresses de vos réseaux sociaux (Facebook, twitter, Linkedin, …) et divers contenus liés à votre Site développé sur Orson.io, y compris connexion à des services tiers,\n" +
                "Nature de l’offre souscrite – tarifs - discount – état des paiements – statut de vos contrats – canal d’acquisition, données partenaires,\n" +
                "Url du Site, navigateur utilisé, ID, utilisation de services tiers,\n" +
                "Contacts du visiteur avec Orson sur le live chat et niveau de satisfaction déclaré. \n" +
                "Orson collecte en outre des informations qui permettent d’améliorer l’expérience utilisateur et de proposer des conseils contextualisés :\n" +
                "\n" +
                "Date de dernière visite, nombre de visites et de publications sur Orson,\n" +
                "Pages visitées,\n" +
                "Emails et communications reçues,\n" +
                "Données calculées de segmentation (nombre de free trial, nombre de publications, nombre de connexions, date de dernière connexion,\n" +
                "Ouverture des messages in app et des emails,\n" +
                "Cookies en particulier afin de permettre le suivi du trafic sur votre Site. \n" +
                "Ces données sont conservées pour une période maximale de dix huit (18) mois après la fin de la relation contractuelle.\n" +
                "\n" +
                "Notification d’incident\n" +
                "Quels que soient les efforts fournis, aucune méthode de transmission sur Internet et aucune méthode de stockage électronique n'est complètement sûre. Nous ne pouvons en conséquence pas garantir une sécurité absolue.\n" +
                "\n" +
                "Si nous prenions connaissance d'une brèche de la sécurité, nous avertirions les utilisateurs concernés afin qu'ils puissent prendre les mesures appropriées. Nos procédures de notification d’incident tiennent compte de nos obligations légales, qu'elles se situent au niveau national ou européen. Nous nous engageons à informer pleinement nos clients de toutes les questions relevant de la sécurité de leur compte et à leur fournir toutes les informations nécessaires pour les aider à respecter leurs propres obligations réglementaires en matière de reporting.\n" +
                "\n" +
                "Aucune information personnelle de l'utilisateur du site https://fr.orson.io n'est publiée à l'insu de l'utilisateur, échangée, transférée, cédée ou vendue sur un support quelconque à des tiers. Seule l'hypothèse du rachat de https://fr.orson.io et de ses droits permettrait la transmission des dites informations à l'éventuel acquéreur qui serait à son tour tenu de la même obligation de conservation et de modification des données vis à vis de l'utilisateur du site https://fr.orson.io.\n" +
                "\n" +
                " Sécurité\n" +
                "Pour assurer la sécurité et la confidentialité des Données Personnelles et des Données Personnelles de Santé, https://fr.orson.io utilise des réseaux protégés par des dispositifs standards tels que par pare-feu, la pseudonymisation, l’encryption et mot de passe.\n" +
                "\n" +
                "Lors du traitement des Données Personnelles, https://fr.orson.io prend toutes les mesures raisonnables visant à les protéger contre toute perte, utilisation détournée, accès non autorisé, divulgation, altération ou destruction.\n" +
                "\n" +
                "Liens hypertextes « cookies » et balises (“tags”) internet\n" +
                "Le site https://fr.orson.io  contient un certain nombre de liens hypertextes vers d’autres sites, mis en place avec l’autorisation de https://fr.orson.io. Cependant, https://fr.orson.io n’a pas la possibilité de vérifier le contenu des sites ainsi visités, et n’assumera en conséquence aucune responsabilité de ce fait.\n" +
                "\n" +
                "Sauf si vous décidez de désactiver les cookies, vous acceptez que le site puisse les utiliser. Vous pouvez à tout moment désactiver ces cookies et ce gratuitement à partir des possibilités de désactivation qui vous sont offertes et rappelées ci-après, sachant que cela peut réduire ou empêcher l’accessibilité à tout ou partie des Services proposés par le site.\n" +
                "\n" +
                "\"Cookies\"\n" +
                "Un « cookie » est un petit fichier d’information envoyé sur le navigateur de l’Utilisateur et enregistré au sein du terminal de l’Utilisateur (ex : ordinateur, smartphone), (ci-après « Cookies »). Ce fichier comprend des informations telles que le nom de domaine de l’Utilisateur, le fournisseur d’accès Internet de l’Utilisateur, le système d’exploitation de l’Utilisateur, ainsi que la date et l’heure d’accès. Les Cookies ne risquent en aucun cas d’endommager le terminal de l’Utilisateur.\n" +
                "\n" +
                "https://fr.orson.io est susceptible de traiter les informations de l’Utilisateur concernant sa visite du Site, telles que les pages consultées, les recherches effectuées. Ces informations permettent à https://fr.orson.io d’améliorer le contenu du Site, de la navigation de l’Utilisateur.\n" +
                "\n" +
                "Les Cookies facilitant la navigation et/ou la fourniture des services proposés par le Site, l’Utilisateur peut configurer son navigateur pour qu’il lui permette de décider s’il souhaite ou non les accepter de manière à ce que des Cookies soient enregistrés dans le terminal ou, au contraire, qu’ils soient rejetés, soit systématiquement, soit selon leur émetteur. L’Utilisateur peut également configurer son logiciel de navigation de manière à ce que l’acceptation ou le refus des Cookies lui soient proposés ponctuellement, avant qu’un Cookie soit susceptible d’être enregistré dans son terminal. https://fr.orson.io informe l’Utilisateur que, dans ce cas, il se peut que les fonctionnalités de son logiciel de navigation ne soient pas toutes disponibles.\n" +
                "\n" +
                "Si l’Utilisateur refuse l’enregistrement de Cookies dans son terminal ou son navigateur, ou si l’Utilisateur supprime ceux qui y sont enregistrés, l’Utilisateur est informé que sa navigation et son expérience sur le Site peuvent être limitées. Cela pourrait également être le cas lorsque https://fr.orson.io ou l’un de ses prestataires ne peut pas reconnaître, à des fins de compatibilité technique, le type de navigateur utilisé par le terminal, les paramètres de langue et d’affichage ou le pays depuis lequel le terminal semble connecté à Internet.\n" +
                "\n" +
                "Le cas échéant, Orson décline toute responsabilité pour les conséquences liées au fonctionnement dégradé du Site et des services éventuellement proposés par https://fr.orson.io, résultant (i) du refus de Cookies par l’Utilisateur (ii) de l’impossibilité pour https://fr.orson.io d’enregistrer ou de consulter les Cookies nécessaires à leur fonctionnement du fait du choix de l’Utilisateur. Pour la gestion des Cookies et des choix de l’Utilisateur, la configuration de chaque navigateur est différente. Elle est décrite dans le menu d’aide du navigateur, qui permettra de savoir de quelle manière l’Utilisateur peut modifier ses souhaits en matière de Cookies.\n" +
                "\n" +
                "À tout moment, l’Utilisateur peut faire le choix d’exprimer et de modifier ses souhaits en matière de Cookies. https://fr.orson.io pourra en outre faire appel aux services de prestataires externes pour l’aider à recueillir et traiter les informations décrites dans cette section.\n" +
                "\n" +
                "Enfin, en cliquant sur les icônes dédiées aux réseaux sociaux Twitter, Facebook, Linkedin et Google Plus figurant sur le Site dehttps://fr.orson.io ou dans son application mobile et si l’Utilisateur a accepté le dépôt de cookies en poursuivant sa navigation sur le Site Internet ou l’application mobile de https://fr.orson.io, Twitter, Facebook, Linkedin et Google Plus peuvent également déposer des cookies sur vos terminaux (ordinateur, tablette, téléphone portable).\n" +
                "\n" +
                "Ces types de cookies ne sont déposés sur vos terminaux qu’à condition que vous y consentiez, en continuant votre navigation sur le Site Internet ou l’application mobile de https://fr.orson.io. À tout moment, l’Utilisateur peut néanmoins revenir sur son consentement à ce que https://fr.orson.io dépose ce type de cookies.\n" +
                "\n" +
                "Balises (\"tags\") internet\n" +
                "Orson peut employer occasionnellement des balises Internet (également appelées « tags », ou balises d’action, GIF à un pixel, GIF transparents, GIF invisibles et GIF un à un) et les déployer par l’intermédiaire d’un partenaire spécialiste d’analyses Web susceptible de se trouver (et donc de stocker les informations correspondantes, y compris l’adresse IP de l’Utilisateur) dans un pays étranger.\n" +
                "\n" +
                "Ces balises sont placées à la fois dans les publicités en ligne permettant aux internautes d’accéder au Site, et sur les différentes pages de celui-ci.\n" +
                "\n" +
                "Cette technologie permet à Orson d’évaluer les réponses des visiteurs face au Site et l’efficacité de ses actions (par exemple, le nombre de fois où une page est ouverte et les informations consultées), ainsi que l’utilisation de ce Site par l’Utilisateur.\n" +
                "\n" +
                "Le prestataire externe pourra éventuellement recueillir des informations sur les visiteurs du Site et d’autres sites Internet grâce à ces balises, constituer des rapports sur l’activité du Site à l’attention de Orson, et fournir d’autres services relatifs à l’utilisation de celui-ci et d’Internet.\n" +
                "\n" +
                "Droit applicable et attribution de juridiction\n" +
                "Tout litige en relation avec l’utilisation du site https://fr.orson.io est soumis au droit français. Il est fait attribution exclusive de juridiction aux tribunaux compétents de Paris.\n" +
                "\n" +
                "Crédit images\n" +
                "Images de la page d'accueil: Craig Garner, Linh Nguyen\n" +
                "Image de la page Qui sommes-nous: Alejandro Escamilla\n" +
                "Images de la page Fonctionnalités: Arvee Marie, koichi nakajima\n" +
                "Images sur la page Template: http://unsplash.com/ et http://picjumbo.com/")

    }
}