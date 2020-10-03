package com.example.myfootball;

import java.util.ArrayList;

class ClubData {
    private static String[] clubNames = {
            "FC Barcelona",
            "Real Madrid C.F",
            "Atletico de Madrid",
            "Sevila FC",
            "Real Betis",
            "Villarreal CF",
            "Celta de Vigo",
            "Valencia FC",
            "Real Sociedad",
            "Atletic Bilbo"
    };

    private static String[] clubDetails = {
            "Fútbol Club Barcelona, juga dikenal sebagai Barcelona atau Barça, adalah klub sepak bola profesional yang berbasis di Barcelona, Catalunya, Spanyol. Didirikan pada tahun 1899 oleh sekelompok pemain Swiss, Inggris, Jerman dan Katalan yang dipimpin oleh Joan Gamper, klub telah menjadi simbol budaya Catalan dan Catalanisme, yang mempunyai motto \"Més que un club\" (Lebih dari sebuah klub). Tidak seperti banyak klub sepak bola lainnya, para pendukung memiliki dan mengoperasikan Barcelona. Ia adalah klub sepak bola kedua terkaya di dunia dalam hal pendapatan, dengan omzet tahunan sebesar €560,8 juta dan kedua yang paling berharga, senilai $3,56 miliar.[2][3] Lagu kebangsaan resmi Barcelona adalah \"Cant del Barça\", yang ditulis oleh Jaume Picas dan Josep Maria Espinas.[4]",
            "Real Madrid Club de Fútbol (pengucapan bahasa Spanyol: [reˈal maˈðɾið ˈkluβ ðe ˈfutβol]; Royal Madrid Football Club), umumnya dikenal sebagai Real Madrid, adalah klub sepak bola profesional yang berbasis di Madrid, Spanyol. Didirikan pada tahun 1902 sebagai Madrid Football Club, secara tradisional mengenakan kostum kandang putih. Kata Real (\"dari kerajaan\") Spanyol dan dianugerahkan ke klub oleh Raja Alfonso XIII pada tahun 1920 bersama-sama dengan mahkota kerajaan di lambang klub. Klub ini telah memainkan pertandingan kandang di Stadion Santiago Bernabéu dengan kapasitas 85.454 di pusat kota Madrid sejak tahun 1947. ",
            "Atlético de Madrid nama lengkap Club Atletico de Madrid, SAD (singkatan dari Sociedad Anónima Deportiva) (pengucapan bahasa Spanyol: [ˈkluβ atˈletiko ðe maˈðɾið]), atau Atlético Madrid, atau juga disebut Atlético atau Atleti, adalah tim sepak bola Spanyol yang bermain di La Liga Santander. Bermarkas di Madrid. Tim yang berdiri tahun 1903 memiliki prestasi yang baik dipercaturan sepak bola Spanyol. Klub ini juga memiliki rivalitas dengan tetangganya Real Madrid, yang dikenal dengan Derbi Madrid. Dalam hal gelar liga yang dimenangkan, Atlético Madrid adalah klub paling sukses ketiga di sepakbola Spanyol – dibelakang Real Madrid dan Barcelona. Atlético telah memenangkan La Liga pada 10 kesempatan, termasuk liga dan piala ganda pada tahun 1996; Piala Raja Spanyol pada 10 kesempatan; dua Piala Super Spanyol dan satu Copa Eva Duarte; di Eropa, mereka memenangkan Piala Winners Eropa pada 1962, menjadi runner-up pada 1963 dan 1986, menjadi runner-up Liga Champions pada 1974, 2014 dan 2016,[5] memenangkan Liga Eropa pada 2010, 2012 dan 2018, dan memenangkan Piala Super UEFA pada 2010, 2012 dan 2018 serta Piala Interkontinental 1974",
            "Sevilla Fútbol Club (pengucapan bahasa Spanyol: [seˈβiʎa ˈfuðβol ˈkluβ]), adalah klub sepak bola profesional Spanyol yang berbasis di Seville, ibu kota dan kota terbesar dari komunitas otonom Andalusia, Spanyol. Itu bermain di papan atas sepak bola Spanyol, La Liga. Sevilla adalah salah satu klub paling sukses di level Eropa, memenangkan Liga Eropa UEFA enam kali, lebih banyak dari klub Eropa lainnya. Ini adalah klub olahraga tertua di Spanyol yang hanya dikhususkan untuk sepak bola.[6][7][8][9] Klub ini dibentuk pada 25 Januari 1890,[6][7][8][9] dengan orang Skotlandia Edward Farquharson Johnston sebagai presiden pertama mereka. Pada tanggal 14 Oktober 1905, anggaran dasar klub terdaftar di Pemerintah Sipil Seville di bawah kepresidenan José Luis Gallegos Arnosa kelahiran Jerez. Sevilla FC juga merupakan klub paling sukses di Andalusia, memenangkan gelar liga nasional pada tahun 1945–1946, lima Piala Spanyol (1935, 1939, 1948, 2007 dan 2010), satu Piala Super Spanyol (2007), rekor enam Piala UEFA/Liga Eropa UEFA (2006, 2007, 2014, 2015, 2016, dan 2020) dan Piala Super UEFA 2006. Mereka juga ditunjuk oleh Federasi Sejarah & Statistik Sepak Bola Internasional sebagai klub terbaik Dunia pada tahun 2006 dan 2007, dengan demikian menjadi klub pertama yang mencapai perbedaan ini dalam dua tahun berturut-turut.",
            "Real Betis Balompié, S.A.D., mengarah ke Betis (diucapkan [ˈβetis]), tim sepak bola profesional yang berbasis di Sevilla. Real Betis Balompié bermain di La Liga dan menempati posisi ke-10 dalam klasifikasi historik liga Spanyol,[1]: sampai tahun 2007 telah mengikuti 45 kali musim kompetisi Divisi I, meraih 3 gelar juara resmi, 1 gelar juara liga, 2 gelar juara Piala Raja Spanyol dan 4 kali tampil sebagai finalis Piala raja. Real Betis merupakan tim pertama dari Andalusia yang bermain di La Liga, dan sanggup menjuarai Copa del Rey, La Liga dan bermain di Piala Champions. ",
            "Villarreal CF adalah nama tim sepak bola Spanyol yang bermarkas di kota Villarreal. Tim ini berdiri pada tahun 1932 dengan stadion kandang di El Madrigal. ",
            "RC Celta Vigo adalah sebuah tim sepak bola Spanyol yang berbasis di Vigo. Tim ini didirikan pada tahun 1923. Klub ini memainkan pertandingan kandangnya di Stadion Balaidos yang berkapasitas 31.500 penonton. Seragam mereka berwarna biru langit dan celana putih.",
            "Valencia Club de Fútbol (bahasa Spanyol: [baˈlenθja ˈkluβ ðe ˈfuðβol], bahasa Valencia: València Club de Futbol [vaˈlensia ˈklub de fubˈbɔɫ];[4] merupakan sebuah klub sepak bola Spanyol yang bermain di Divisi Primera Spanyol, La Liga. Tim ini bermarkas di Valencia, Spanyol. Didirikan pada tahun 1919. ",
            "Real Sociedad de Fútbol, S.A.D. (lebih sering disebut sebagai Real Sociedad [reˈal soθjeˈðað]) adalah sebuah klub sepak bola Spanyol yang berbasis di kota San Sebastián, Basque, didirikan pada 7 September 1909. Stadion kandang mereka adalah Anoeta, yang berkapasitas 32.200 penonton. Prestasi Real Sociedad di La Liga adalah menjadi juara pada tahun 1980-81 dan 1981-82, serta terakhir kali menjadi juara kedua pada tahun 2002-03. Klub ini memainkan derby Basque melawan Athletic Bilbao. Real Sociedad adalah anggota pendiri La Liga pada tahun 1928, dan penampilan terpanjang mereka di La Liga adalah selama 40 musim dari 1967 hingga 2007.[1] ",
            "Athletic Club Bilbao adalah sebuah tim sepak bola Spanyol. Berbasis di Bilbao, Basque Country. Tim ini didirikan tahun 1898 oleh para pelaut Inggris dari Southampton, hal ini berpengaruh pada warna jersey Athletic Club.[3] "
    };

    private static int[] clubImages = {
            R.drawable.barcelona,
            R.drawable.real_madrid,
            R.drawable.atletico_madrid,
            R.drawable.sevila,
            R.drawable.real_betis,
            R.drawable.villarreal,
            R.drawable.celta_de_vigo,
            R.drawable.valencia,
            R.drawable.real_sociedad,
            R.drawable.athletic_bilbo
    };

    static ArrayList<Club> getListData() {
        ArrayList<Club> list = new ArrayList<>();
        for (int position = 0; position < clubNames.length; position++) {
            Club club = new Club();
            club.setName(clubNames[position]);
            club.setDetail(clubDetails[position]);
            club.setPhoto(clubImages[position]);
            list.add(club);
        }
        return list;
    }
}
