package com.maprojek.recyclerview_listhewanendemikindo;

import java.util.ArrayList;

public class EndemikData {

    private static String[] namaEndemik = {
        "Harimau Sumatera",
        "Beo Nias",
        "Banteng Jawa",
        "Badak Jawa",
        "Orangutan",
        "Bekantan",
        "Burung Maleo",
        "Babirusa",
        "Cendrawasih",
        "Kasuari"
    };

    private static String[] detailEndemik = {
        "Harimau Sumatra  atau dalam bahasa latin disebut Panthera tigris sumatrae merupakan satu dari lima subspisies harimau (Panthera tigris) di dunia yang masih bertahan hidup. Harimau Sumatera termasuk satwa langka yang juga merupakan satu-satunya sub-spisies harimau yang masih dipunyai Indonesia setelah dua saudaranya Harimau Bali (Panthera tigris balica) dan Harimau Jawa (Panthera tigris sondaica) dinyatakan punah. Hewan dari filum Chordata ini hanya dapat diketemukan di Pulau Sumatera, Indonesia. Populasinya di alam liar diperkirakan tinggal 400–500 ekor. Harimau Sumatera (Panthera tigris sumatrae) semakin langka dan dikategorikan sebagai satwa yang terancam punah.",
        "Beo nias merupakan salah satu subspesies (anak jenis) burung beo yang hanya terdapat (endemik) di pulau Nias, Sumatera Utara. Beo nias yang mempunyai ukuran paling besar dibandingkan subspesies beo lainnya paling populer dan banyak diminati oleh para penggemar burung beo lantaran kepandaiannya dalam menirukan berbagai macam suara termasuk ucapan manusia. Sayang, beo nias yang endemik Sumatera Utara ini semakin hari semakin langka. Beo Nias ditetapkan sebagai fauna identitas provinsi Sumatera Utara. Burung populasinya lebih banyak terdapat di dalam sangkar ketimbang di alam bebas padahal burung endemik yang langka ini termasuk satwa yang dilindungi berdasarkan Peraturan Perlindungan Binatang Liar Tahun 1931, Surat Keputusan Menteri Pertanian No. 421/Kpts/Um/8/1970, Undang-undang No. 5 Tahun 1990, dan Peraturan pemerintah No. 7 Tahun 1999. Subspesies beo yang mempunyai nama latin Gracula religiosa robusta ini sering disebut juga sebagai Ciong atau Tiong. Dalam bahasa Inggris, burung endemik ini biasa disebut Common Hill Myna. Ciri dan Tingkah Laku Beo Nias. Beo nias (Gracula religiosa robusta) termasuk burung berukuran sedang dengan panjang tubuh sekitar 40 cm. Ukuran beo nias lebih besar dari pada jenis beo lainnya.",
        "Banteng jawa (Bos javanicus) merupakan salah satu jenis satwa liar berkuku genap dan termasuk mamalia dalam golongan ruminansia besar. Banteng jawa ini, di masa lampau tersebar di hampir seluruh hutan Pulau Jawa (Hoogerwerf 1970). Secara morfologis, banteng jawa (Bos javanicus)  memiliki tubuh yang tegap, besar, dan kuat, serta pada bagian dadanya terdapat gelambir yang dimulai dari pangkal kaki depan sampai bagian leher, tetapi tidak mencapai daerah kerongkongan. Bagian bahu depan banteng jawa lebih tinggi dibandingkan bagian belakang tubuhnya. Ciri khas yang dimiliki banteng adalah pada bagian pantat, bagian kaki dari lutut ke bawah berwarna putih seolah-olah memakai kaos kaki berwarna putih, serta pada bagian atas dan bawah bibir berwarna putih (Alikodra, 1983).",
        "Badak Jawa dengan nama latin “Rhinoceros sondaicus” merupakan salah satu hewan endemik terlangka di dunia, dimana diperkirakan jumlah populasinya tidak lebih dari 60 ekor saja yang menyebar di Taman Nasional Ujung Kulon. Selain itu, Badak Jawa juga merupakan jenis Badak paling langka diantara lima jenis Badak yang ada di dunia, bahkan masuk daftar hewan yang terancam punah. Sebagaimana kita ketahui, Badak adalah salah hewan purba yang masih hidup sampai sekarang, dimana Badak diperkirakan sudah ada sejak 65 juta tahun yang lalu dan diperkirakan memiliki 30 jenis.",
        "Orangutan Kalimantan (Pongo pygmaeus) ini adalah salah satu jenis orang utan yang ada di Indonesia. Orang utan ini adalah hewan endemik dari Kalimantan yang dapat hidup hingga 60 tahun dan keberadaannya dapat ditemukan di sebagian besar wilayah di Kalimantan.",
        "Bekantan (Nasalis larvatus)adalah hewan sejenis monyet yang dengan hidung panjang dan rambut cokelat kemerahan. Hewan ini merupakan hewan endemik dari Pulau Kalimantan termasuk malaysia (sabah dan serawak) dan brunai. Biasanya bekantan menghabiskan sebagian waktunya di atas pohon di sekitaran hutan bakau,hutan pantai ataupun rawa. Bekantan hidup secara berkelompok. Bekantan (nama ilmiah: Nasalis larvatus) adalah jenis monyet berhidung panjang dengan rambut berwarna coklat kemerahan dan merupakan satu dari dua spesies dalam genus Nasalis. Bekantan merupakan hewan endemik pulau Kalimantan yang tersebar di hutan bakau, rawa dan hutan pantai. Ciri utama yang membedakan bekantan dari monyet lainnya adalah hidung panjang dan besar yang hanya ditemukan di spesies jantan. Bekantan merupakan fauna identitas provinsi Kalimantan Selatan. Hewan ini dikenal dengan berbagai nama, misalnya proboscis monkey atau long-nosed monkey dalam bahasa Inggris, kera bekantan dalam bahasa Malaysia, bangkatan untuk Brunei, sementara penduduk sekitar juga menyebutnya monyet belanda atau kera belanda, pika, bahara bentangan, raseng, dan kahau.[2][3] Berdasarkan penangkapan liar yang terus berlanjut, hilangnya hutan, dan keterbatasan habitatnya, bekantan ditempatkan dalam status terancam punah (endangered) di dalam daftar merah IUCN. Spesies ini dilindungi baik oleh organisasi dunia maupun pemerintah Indonesia.",
        "Burung Maleo (Macrocephalon maleo) adalah salah satu spesies burung endemik dari pulau Sulawesi. Burung ini endemik di hutan tropis dataran rendah pulau Sulawesi seperti di Gorontalo (Bone Bolango dan Pohuwato) dan Sulawesi Tengah (Sigi dan Banggai). Burung ini memiliki keunikan yaitu pada saat baru menetas anak burung maleo sudah dapat terbang. Burung maleo memiliki tonjolan di atas kepalanya yang berfungsi sebagai pendeteksi panas guna menetaskan telurnya. Telur burung maleo memiliki ukuran sekitar 11 cm dengan berat sekitar 240-270 gram. Burung maleo kini masuk dalam daftar hewan yang terancam punah.",
        "Babirusa (Babyrousa babyrussa) salah satu jenis babi yang banyak ditemukan di hutan hujan tropis di Pulau Sulawesi, Sula, Togian, Malenge dan Buru. Makanan Babirusa adalah tumbuhan dan buah-buahan.",
        "Burung yang sangat indah ini sudah terkenal ke seluruh penjuru dunia, sehingga burung cenderawasih mempunyai julukan sebagai Bird Of Paradise. Burung ini hanya ada di timur indonesia tepatnya di Papua, ada sekitar 30 spesies cenderawasih di papua dan salah satunya merupakan Seleucidis Melanoleuca yang termasuk spesies yang dilindungi negara. Sayangnya burung cenderawasih atau yang biasa di juluki burung surga ini terancam punah akibat ulah tangan manusia yang tidak bertanggung jawab.",
        "Burung kasuari memiliki satu gelambir. Hewan ini bulunya sangat lebat, dan mempunyai tinggi badan sekitar 160 cm dengan berat 55-58 kg. Burung ini tidak bersayap dan termasuk hewan pemakan buah-buahan, tapi jangan pernah bersentuhan langsung dengan burung ini, karena jika burung ini merasa terancam kakinya yang besar dan sangat berbahaya siap untuk menendang anda sampai bisa mencidirai dengan parah sehingga berakibat kematian. Kasuari hanya hidup di pulau papua dan papua new guinea."
    };

    private static int[] fotoEndemik = {
            R.drawable.sumateraharimau,
            R.drawable.sumaterabeonias,
            R.drawable.jawabantengjawa,
            R.drawable.jawabadak,
            R.drawable.kalimantanorangutan,
            R.drawable.kalimantanbekantan,
            R.drawable.sulawesiburungmaleo,
            R.drawable.sulawesibabirusa,
            R.drawable.papuacenderawasih,
            R.drawable.papuakasuari
    };

    static ArrayList<Endemik> getListData(){
        ArrayList<Endemik> list = new ArrayList<>();
        for(int position=0;position < namaEndemik.length;position++ ){
            Endemik endemik = new Endemik();
            endemik.setNama(namaEndemik[position]);
            endemik.setDetail(detailEndemik[position]);
            endemik.setFoto(fotoEndemik[position]);
            list.add(endemik);

        }
        return list;

    }




}
