package com.example.challengechapter3.utils

import com.example.challengechapter3.R
import com.example.challengechapter3.model.MoreResultModel
import com.example.challengechapter3.model.RecentlyResultModel
import com.example.challengechapter3.model.RecommendResultModel

fun fetchContentRecommended(identifier: String?): List<RecommendResultModel> {
    return when (identifier) {
        "Jazz" -> listOf(
            RecommendResultModel(songImage = R.drawable.laufey1, songTitle = "Let You Break My Heart Again", songArtist = "Laufey"),
            RecommendResultModel(songImage = R.drawable.flymetothemoon, songTitle = "Fly Me to the Moon", songArtist = "Frank Sinatra"),
            RecommendResultModel(songImage = R.drawable.adream, songTitle = "A Dream is a Wish Your Heart Makes", songArtist = "Lily James"),
            RecommendResultModel(songImage = R.drawable.whenifall, songTitle = "When I Fall in Love", songArtist = "Nat King Cole"),
        )
        "EDM" -> listOf(
            RecommendResultModel(songImage = R.drawable.edm1, songTitle = "Bangarang", songArtist = "Skrillex"),
            RecommendResultModel(songImage = R.drawable.edm2, songTitle = "Lights", songArtist = "Ellie Goulding"),
            RecommendResultModel(songImage = R.drawable.edm3, songTitle = "Waiting For Love", songArtist = "Avicii"),
            RecommendResultModel(songImage = R.drawable.edm4, songTitle = "Beauty And A Beat", songArtist = "Justin Bieber"),
        )
        "Techno" -> listOf(
            RecommendResultModel(songImage = R.drawable.techno1, songTitle = "Spastik", songArtist = "Richie Hawtin"),
            RecommendResultModel(songImage = R.drawable.techno2, songTitle = "Moon Rocks", songArtist = "Enrico Sangiuliano"),
            RecommendResultModel(songImage = R.drawable.techno3, songTitle = "Heute Nacht", songArtist = "Maddix"),
            RecommendResultModel(songImage = R.drawable.techno4, songTitle = "Conjure Dreams", songArtist = "Maceo Plex"),
        )
        "Future Bass" -> listOf(
            RecommendResultModel(songImage = R.drawable.fb1, songTitle = "Don't Let Me Down", songArtist = "The Chainsmokers"),
            RecommendResultModel(songImage = R.drawable.fb2, songTitle = "We Rise", songArtist = "San Holo"),
            RecommendResultModel(songImage = R.drawable.fb3, songTitle = "Feel Good", songArtist = "Gryffin"),
            RecommendResultModel(songImage = R.drawable.fb4, songTitle = "Light", songArtist = "San Holo"),
        )
        "K-pop" -> listOf(
            RecommendResultModel(songImage = R.drawable.kpop1, songTitle = "ANTIFRAGILE", songArtist = "LE SSERAFIM"),
            RecommendResultModel(songImage = R.drawable.kpop2, songTitle = "LOVE DIVE", songArtist = "IVE"),
            RecommendResultModel(songImage = R.drawable.kpop3, songTitle = "RUN", songArtist = "BTS"),
            RecommendResultModel(songImage = R.drawable.kpop4, songTitle = "Talk that Talk", songArtist = "TWICE"),
        )
        "Pop" -> listOf(
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Get Lucky", songArtist = "Daft Punk"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Uptown Funk", songArtist = "Mark Ronson"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Umbrella", songArtist = "Rihanna"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Adore You", songArtist = "Harry Styles"),
        )
        "Indie" -> listOf(
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Buttons", songArtist = "Steve Lacy"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Runner", songArtist = "Alex G"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Orange Blood", songArtist = "Mt. Joy"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "New Romance", songArtist = "Beach House"),
        )
        "Rock" -> listOf(
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Bohemian Rhapsody", songArtist = "Queen"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "American Girl", songArtist = "Tom Petty"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "You Really Got Me", songArtist = "The Kinks"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Born To Run", songArtist = "Bruce Springsteen"),
        )
        "Funk" -> listOf(
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Word Up", songArtist = "Cameo"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Get Down on It", songArtist = "Kool & The Gang"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Funkytown", songArtist = "Lipps Inc"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Give It To Me Baby", songArtist = "Rick James"),
        )
        "Heavy Metal" -> listOf(
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Black No. 1 (Little Miss Scare-All)", songArtist = "Type O Negative"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Evil", songArtist = "Mercyful Fate"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "All We Are", songArtist = "Warlock"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "You Can’t Bring Me Down", songArtist = "Suicidal Tendencies"),
        )
        "Reggae" -> listOf(
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Now That We Found Love", songArtist = "Third World"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Many Rivers to Cross", songArtist = "Jimmy Cliff"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "I Don’t Wanna Dance", songArtist = "Eddy Grant"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Baby Come Back", songArtist = "Pato Banton"),
        )
        "Hard Rock" -> listOf(
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Magic Carpet Ride", songArtist = "Steppenwolf"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Won’t Get Fooled Again", songArtist = "The Who"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Stairway to Heaven", songArtist = "Led Zeppelin"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "November Rain", songArtist = "Guns N' Roses"),
        )
        "Rap" -> listOf(
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "B.M.F. (Blowin’ Money Fast)", songArtist = "Rick Ross"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Tomorrow 2", songArtist = "Cardi B"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Gin and Juice", songArtist = "Snoop Dogg"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Deep Cover", songArtist = "Dr. Dre"),
        )
        "Folk" -> listOf(
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Freight Train", songArtist = "Elizabeth Cotten"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Some Day Soon", songArtist = "Ian & Sylvia"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "City of New Orleans", songArtist = "Judy Collins"),
            RecommendResultModel(songImage = R.drawable.cover_techno, songTitle = "Ramblin’ Boy", songArtist = "Tom Paxton"),
        )
        else -> emptyList()
    }
}

fun fetchContentRecently(identifier: String?): List<RecentlyResultModel> {
    return when (identifier) {
        "Jazz" -> listOf(
            RecentlyResultModel(songImage = R.drawable.laufey1, songTitle = "Let You Break My Heart Again", songArtist = "Laufey"),
            RecentlyResultModel(songImage = R.drawable.laufey2, songTitle = "Promise", songArtist = "Laufey"),
            RecentlyResultModel(songImage = R.drawable.laufey4, songTitle = "Falling Behind", songArtist = "Laufey"),
            RecentlyResultModel(songImage = R.drawable.laufey3, songTitle = "From The Start", songArtist = "Laufey"),
        )
        "EDM" -> listOf(
            RecentlyResultModel(songImage = R.drawable.edm5, songTitle = "Clarity", songArtist = "Zedd"),
            RecentlyResultModel(songImage = R.drawable.edm6, songTitle = "Summer", songArtist = "Calvin Harris"),
            RecentlyResultModel(songImage = R.drawable.edm7, songTitle = "Closer", songArtist = "The Chainsmokers"),
            RecentlyResultModel(songImage = R.drawable.edm8, songTitle = "Wake Me Up", songArtist = "Avicii"),
        )
        "Techno" -> listOf(
            RecentlyResultModel(songImage = R.drawable.techno5, songTitle = "Inferno", songArtist = "Carl Cox"),
            RecentlyResultModel(songImage = R.drawable.techno6, songTitle = "Rave The Planet", songArtist = "Kai Tracid"),
        )
        "Future Bass" -> listOf(
            RecentlyResultModel(songImage = R.drawable.fb4, songTitle = "Feel Good", songArtist = "Gryffin"),
            RecentlyResultModel(songImage = R.drawable.fb5, songTitle = "Love Is Gone", songArtist = "SLANDER"),
            RecentlyResultModel(songImage = R.drawable.fb6, songTitle = "Roses", songArtist = "The Chainsmokers"),
            RecentlyResultModel(songImage = R.drawable.fb7, songTitle = "Revolution", songArtist = "Diplo"),
        )
        "K-pop" -> listOf(
            RecentlyResultModel(songImage = R.drawable.kpop5, songTitle = "OMG", songArtist = "NewJeans"),
            RecentlyResultModel(songImage = R.drawable.kpop6, songTitle = "Cookie", songArtist = "NewJeans"),
            RecentlyResultModel(songImage = R.drawable.kpop7, songTitle = "Get Up", songArtist = "NewJeans"),
            RecentlyResultModel(songImage = R.drawable.kpop8, songTitle = "Super Shy", songArtist = "NewJeans"),
        )
        "Pop" -> listOf(
            RecentlyResultModel(songImage = R.drawable.cover_techno, songTitle = "Happy", songArtist = "Pharrell Williams"),
            RecentlyResultModel(songImage = R.drawable.cover_techno, songTitle = "drivers license", songArtist = "Olivia Rodrigo"),
        )
        "Indie" -> listOf(
            RecentlyResultModel(songImage = R.drawable.cover_techno, songTitle = "I Bet You Look Good on the Dancefloor", songArtist = "Arctic Monkeys"),
            RecentlyResultModel(songImage = R.drawable.cover_techno, songTitle = "Ghost of Chicago", songArtist = "Noah Floersch"),
            RecentlyResultModel(songImage = R.drawable.cover_techno, songTitle = "The Party Line", songArtist = "Belle and Sebastian")
        )
        "Rock" -> listOf(
            RecentlyResultModel(songImage = R.drawable.cover_techno, songTitle = "Fell in Love With a Girl", songArtist = "The White Stripes"),
        )
        "Funk" -> listOf(
            RecentlyResultModel(songImage = R.drawable.cover_techno, songTitle = "Kiss", songArtist = "The Revolution"),
            RecentlyResultModel(songImage = R.drawable.cover_techno, songTitle = "Use Me", songArtist = "Bill Withers"),
        )
        "Heavy Metal" -> listOf(
            RecentlyResultModel(songImage = R.drawable.cover_techno, songTitle = "Photograph", songArtist = "Def Leppard"),
            RecentlyResultModel(songImage = R.drawable.cover_techno, songTitle = "Breaking the Law", songArtist = "Judas Priest"),
            RecentlyResultModel(songImage = R.drawable.cover_techno, songTitle = "Bring the Noise", songArtist = "Anthrax"),
        )
        "Reggae" -> listOf(
            RecentlyResultModel(songImage = R.drawable.cover_techno, songTitle = "I Shot The Sheriff", songArtist = "Bob Marley"),
        )
        "Hard Rock" -> listOf(
            RecentlyResultModel(songImage = R.drawable.cover_techno, songTitle = "November Rain", songArtist = "Guns N' Roses"),
            RecentlyResultModel(songImage = R.drawable.cover_techno, songTitle = "Kashmir", songArtist = "Led Zeppelin"),
            RecentlyResultModel(songImage = R.drawable.cover_techno, songTitle = "Eye of the Tiger", songArtist = "Survivor"),
            RecentlyResultModel(songImage = R.drawable.cover_techno, songTitle = "Dream On", songArtist = "Aerosmith"),
        )
        "Rap" -> listOf(
            RecentlyResultModel(songImage = R.drawable.cover_techno, songTitle = "The Search", songArtist = "NF"),
            RecentlyResultModel(songImage = R.drawable.cover_techno, songTitle = "Hope", songArtist = "NF"),
            RecentlyResultModel(songImage = R.drawable.cover_techno, songTitle = "HAPPY", songArtist = "NF"),
            RecentlyResultModel(songImage = R.drawable.cover_techno, songTitle = "Lie", songArtist = "NF"),
        )
        "Folk" -> listOf(
            RecentlyResultModel(songImage = R.drawable.cover_techno, songTitle = "Four Strong Winds", songArtist = "Ian & Sylvia"),
            RecentlyResultModel(songImage = R.drawable.cover_techno, songTitle = "Don’t Think Twice, It’s All Right", songArtist = "Bob Dylan"),
        )
        else -> emptyList()
    }
}

fun fetchContentMore(identifier: String?): List<MoreResultModel> {
    return when (identifier) {
        "Jazz" -> listOf(
            MoreResultModel(songImage = R.drawable.laufey3, songTitle = "From The Start", songArtist = "Laufey"),
            MoreResultModel(songImage = R.drawable.whatawonderful, songTitle = "What a Wonderful World", songArtist = "Louis Armstrong"),
            MoreResultModel(songImage = R.drawable.igotrhythm, songTitle = "I Got Rhythm", songArtist = "Sarah Vaughan"),
            MoreResultModel(songImage = R.drawable.itdontmean, songTitle = "It Don't Mean a Thing", songArtist = "Duke Ellington"),
        )
        "EDM" -> listOf(
            MoreResultModel(songImage = R.drawable.edm9, songTitle = "Lean on", songArtist = "DJ Snake"),
            MoreResultModel(songImage = R.drawable.edm10, songTitle = "Titanium", songArtist = "David Guetta"),
            MoreResultModel(songImage = R.drawable.edm11, songTitle = "Animals", songArtist = "Martin Garrix"),
            MoreResultModel(songImage = R.drawable.edm12, songTitle = "Where Are U Now", songArtist = "Diplo"),
        )
        "Techno" -> listOf(
            MoreResultModel(songImage = R.drawable.techno7, songTitle = "Move Your Body To The Beat", songArtist = "Reinier Zonneveld"),
            MoreResultModel(songImage = R.drawable.techno8, songTitle = "Sandstorm", songArtist = "Darude"),
            MoreResultModel(songImage = R.drawable.techno9, songTitle = "Motor Rotor", songArtist = "Maceo Plex"),
        )
        "Future Bass" -> listOf(
            MoreResultModel(songImage = R.drawable.fb9, songTitle = "Runaway (U & I)", songArtist = "Galantis"),
            MoreResultModel(songImage = R.drawable.fb10, songTitle = "Closer feat. Halsey", songArtist = "The Chainsmokers"),
            MoreResultModel(songImage = R.drawable.fb11, songTitle = "Just Like That", songArtist = "Pegboard Nerds"),
            MoreResultModel(songImage = R.drawable.fb12, songTitle = "Lose It", songArtist = "Flume"),
        )
        "K-pop" -> listOf(
            MoreResultModel(songImage = R.drawable.kpop9, songTitle = "Me Gustas Tu", songArtist = "GFRIEND"),
            MoreResultModel(songImage = R.drawable.kpop10, songTitle = "TOMBOY", songArtist = "(G)I-DLE"),
            MoreResultModel(songImage = R.drawable.kpop11, songTitle = "LOVE SCENARIO", songArtist = "iKON"),
            MoreResultModel(songImage = R.drawable.kpop12, songTitle = "Décalcomanie", songArtist = "Mamamoo"),
        )
        "Pop" -> listOf(
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Dance The Night", songArtist = "Dua Lipa"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "bad guy", songArtist = "Billie Eilish"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Firework", songArtist = "Katy Perry"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Counting Stars", songArtist = "OneRepublic"),
        )
        "Indie" -> listOf(
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Weird Goodbyes", songArtist = "The National"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Into Your Room", songArtist = "Holly Humberstone"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Believe", songArtist = "Mumford & Sons"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Motion Sickness", songArtist = "Phoebe Bridgers"),
        )
        "Rock" -> listOf(
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "There She Goes, My Beautiful World", songArtist = "Nick Cave"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Barracuda", songArtist = "Heart"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Wuthering Heights", songArtist = "Kate Bush"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "School’s Out", songArtist = "Alice Cooper"),
        )
        "Funk" -> listOf(
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Shining Star", songArtist = "Earth, Wind & Fire"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Low Rider", songArtist = "War"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Fire", songArtist = "Ohio Players"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Theme From Shaft", songArtist = "Isaac Hayes"),
        )
        "Heavy Metal" -> listOf(
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Metal Health", songArtist = "Quiet Riot"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Blood and Thunder", songArtist = "Mastodon"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "We Will Rise", songArtist = "Arch Enemy"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "The Cry of Mankind", songArtist = "My Dying Bride"),
        )
        "Reggae" -> listOf(
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Red Red Wine", songArtist = "UB40"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Don't Worry Be Happy", songArtist = "Bobby McFerrin"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Don't Turn Around", songArtist = "Aswad"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Underneath It All", songArtist = "No Doubt"),
        )
        "Hard Rock" -> listOf(
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Never Too Late", songArtist = "Three Days Grace"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "We Will Rock You", songArtist = "Queen"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Cult of Personality", songArtist = "Living Colour"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Highway to Hell", songArtist = "AC/DC"),
        )
        "Rap" -> listOf(
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Deep Cover", songArtist = "Dr. Dre"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Empire State of Mind", songArtist = "Jay-Z"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "The Bridge", songArtist = "MC Shan"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Passin’ Me by", songArtist = "The Pharcyde"),
        )
        "Folk" -> listOf(
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Across the Great Divide", songArtist = "Kate Wolf"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Kisses Sweeter Than Wine", songArtist = "The Weavers"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Love Is Our Cross to Bear", songArtist = "John Gorka"),
            MoreResultModel(songImage = R.drawable.cover_techno, songTitle = "Puff the Magic Dragon", songArtist = "Peter, Paul and Mary"),
        )
        else -> emptyList()
    }
}