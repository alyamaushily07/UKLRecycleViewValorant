package com.example.uklrecycleviewvalorant

object AgentData {
    private val data = arrayOf(
        arrayOf(
            "Brimstone",
            "The oldest of the group, Brimstone is a commander with a long history of wearing a uniform, but as if teaching from age and experience wasn't enough to prove his place in leading an organization composed of unique individuals who are each an elite in their own right, then perhaps continuing to work with boots on the ground sealed the deal. ",
            "https://static.wikia.nocookie.net/valorant/images/8/81/Brimstone_Artwork_Full.png/revision/latest/scale-to-width-down/700?cb=20220810202719"
        ),
        arrayOf(
            "Viper",
            "Viper is a savage and confident agent who doesn't fear enemies, and in fact desires the enemies' fear. She does not hesitate to call herself a villain and a monster, and will act like both if it means the success of her objective. Just like her abilities, she can be quite \"toxic\", however she is seen being more amiable and caring towards her teammates, but she will not hesitate to reprimand them harshly should they make major miscalculations in the battlefield. ",
            "https://static.wikia.nocookie.net/valorant/images/8/85/Viper_Artwork_Full.png/revision/latest/scale-to-width-down/700?cb=20220810202837"
        ),
        arrayOf(
            "Omen",
            "A living nightmare, Omen takes full advantage of his shadowed physique and will not hesitate to eliminate his enemies using the forces of paranoia and fear. He is cynical in nature, which stems from him experiencing extreme pain as he was condemned to remain in the state that he is today. If there's one person who wants to know more about his mysterious circumstances, it's Omen himself - and quite desperately so. ",
            "https://static.wikia.nocookie.net/valorant/images/0/0e/Omen_Artwork_Full.png/revision/latest/scale-to-width-down/700?cb=20220810202807"
        ),
        arrayOf(
            "Killjoy",
            "The epitome of German efficiency, Killjoy always shows excitement at the opportunity of being able to use the technology she builds to its fullest extent, as well as the chance to retrieve additional knowledge. Always ambitious in her work, Killjoy has shamelessly admitted that she has a history of exploiting tech-related missions in order to \"weasel more money\" out of the Protocol's quarterly budget. ",
            "https://static.wikia.nocookie.net/valorant/images/8/81/Killjoy_Artwork_Full.png/revision/latest/scale-to-width-down/700?cb=20220810202751"
        ),
        arrayOf(
            "Cypher",
            "Cypher is constantly gathering secrets, information, and intel, to the point of managing to retrieve the passwords of everyone in the VALORANT Protocol. He keeps most of this information to himself, making sure that no one ever discovers them and only revealing anything he knows for a price. In contrast of how he knows a lot about his allies, they do not know much about him, and he prefers to keep it that way. ",
            "https://static.wikia.nocookie.net/valorant/images/5/55/Cypher_Artwork_Full.png/revision/latest/scale-to-width-down/700?cb=20220810202731"
        ),
        arrayOf(
            "Sova",
            "A humble hunter that has taken down man and beast alike, Sova works carefully and with precision, scouting around and retrieving information before taking out the enemy. As he has told Phoenix, Sova believes in the value of patience and strategic thinking. Being the team player that he is, Sova always commends his allies and never hesitates to voice out his vote of confidence in them. He seems to value the team to the point of risking his own life, to which Brimstone reminds him that it is equally important that he looks out after himself. ",
            "https://static.wikia.nocookie.net/valorant/images/c/c5/Sova_Artwork_Full.png/revision/latest/scale-to-width-down/700?cb=20220810202832"
        ),
        arrayOf(
            "Sage",
            "Described as a stronghold, Sage is an agent who always looks out for her teammates and offers help whenever she can. She has fully embraced her powers which give her control of life, and wishes to use them to keep her team alive for as long as possible. Calmer and more collected than some of her more energetic allies, Sage always imparts encouraging words to rally the team up and guide them to victory. ",
            "https://static.wikia.nocookie.net/valorant/images/7/7e/Sage_Artwork_Full.png/revision/latest/scale-to-width-down/700?cb=20220810202824"
        ),
        arrayOf(
            "Phoenix",
            "A duelist by role and nature, Phoenix is brash, impulsive, and has a lot of confidence, never hesitating to charge into a fight head-on despite not getting a full grasp of the situation, much to the chagrin of his more collected teammates. As shown in \"RETAKE,\" if Phoenix gets himself in a sticky situation caused by his own impatience, he is more than capable of quickly adapting to the circumstances and turning the tables around, before rubbing it in the faces of teammates who initially doubted him. ",
            "https://static.wikia.nocookie.net/valorant/images/9/90/Phoenix_Artwork_Full.png/revision/latest/scale-to-width-down/700?cb=20220810202811"
        ),
        arrayOf(
            "Jett",
            "The wind is commonly known for being cool, but Jett is an aggressive agent who has a distinctive, sarcastic personality. Jett also has a cheeky, childish \"in-your-face\" attitude, seen commonly giving insults for feats she makes on the team and is always spouting her sheer amount of arrogance. Her self-confidence may feel as if she is disregarding her comrades' safety, but she has recognized that it is best to play with a team, albeit with some reluctance. She does show a much more friendly personality towards teammates. ",
            "https://static.wikia.nocookie.net/valorant/images/e/e3/Jett_Artwork_Full.png/revision/latest/scale-to-width-down/700?cb=20220810202742"
        ),
        arrayOf(
            "Reyna",
            "Reyna takes what she wants when she wants it, no matter who is standing in her way. Savage and almost animalistic, she is not one to hesitate when it comes to eliminating her enemies and getting blood on her hands. She has a strong dislike for technology and thrives on the enemy's misery, and loves to compete with fellow Radiants to see who is the most powerful. ",
            "https://static.wikia.nocookie.net/valorant/images/3/36/Reyna_Artwork_Full.png/revision/latest/scale-to-width-down/700?cb=20220810202820"
        )
    )


    val listData: ArrayList<Agent>
        get() {
            val list = arrayListOf<Agent>()
            for (aData in data) {
                val Agent = Agent()
                Agent.name = aData[0]
                Agent.from = aData[1]
                Agent.photo = aData[2]


                list.add(Agent())
            }


            return list
        }
}
