package com.example.mywolkoutjourney;

import android.util.Log;

import java.util.ArrayList;

public class Utils {
    private static ArrayList<LatihanModel> allTrainings;
    private static ArrayList<JadwalModel> usersPlan;

    public Utils(){
        if(null==allTrainings)
            allTrainings = new ArrayList<>();
        if(null==usersPlan)
            usersPlan = new ArrayList<>();
        LatihanModel RecliningTrain = new LatihanModel();
        RecliningTrain.setNama("Reclining Circle");
        RecliningTrain.setDeskripsi("Cara gerakan : Duduk di lantai dengan lutut tertekuk 90 derajat dan kaki rata di lantai di depan Anda. Condongkan badan ke belakang dan berat badan bertumpu pada siku dengan telapak tangan menghadap ke bawah. Kemudian kencangkan otot perut dan angkat kaki dari lantai. Tanpa mengubah posisi lutut, bentuk lingkaran dengan kaki dalam satu arah. Berhenti sejenak, lalu bentuk lingkaran dengan kaki ke arah yang berlawanan.\n\nManfaat gerakan : Melatih otot perut, pinggul dan punggung");
        RecliningTrain.setGambar("https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AATywF.img?m=1&b=black&w=867&h=488&f=jpeg&q=60");
        allTrainings.add(RecliningTrain);

        LatihanModel plankTrain = new LatihanModel();
        plankTrain.setNama("Plank Pose");
        plankTrain.setDeskripsi("Cara gerakan : Langkahkan kaki ke belakang dengan jari kaki ditekuk, sehingga bahu sejajar dengan lipatan pergelangan tangan. Buka jari kaki lebar-lebar. Kedua kaki terpisah selebar pinggul. Kemudian dagu sedikit terlipat, jaga tulang belakang tengkuk sejajar dengan badan. Tarik pusar ke tulang belakang dan dengan berenergi capai kembali melalui tumit saat Anda mencapai maju melalui ubun-ubun. Bernapaslah di posisi ini sekurangnya tiga tarikan napas panjang.\n\nManfaat gerakan : Melatih inti tubuh, kaki, lengan dan sendi");
        plankTrain.setGambar("https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AATRWz.img?m=1&b=black&w=867&h=488&f=jpeg&q=60");
        allTrainings.add(plankTrain);

        LatihanModel AbdominalTrain = new LatihanModel();
        AbdominalTrain.setNama("Abdominal Leg Rotations");
        AbdominalTrain.setDeskripsi("Cara gerakan : Telentang dengan panggul stabil dan sedikit miring. Julurkan kedua kaki lurus ke atas. Lalu putar tumit bersamaan dan buka kedua kaki ke samping. Terakhir putar kedua kaki ke dalam dan satukan mereka kembali.\n\nManfaat gerakan : Meningkatkan kestabilan panggul dengan pergerakan pinggul.");
        AbdominalTrain.setGambar("https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AAQNR9.img?m=1&b=black&w=867&h=488&f=jpeg&q=60");
        allTrainings.add(AbdominalTrain);

        LatihanModel reachTrain = new LatihanModel();
        reachTrain.setNama("Reach, Roll, and Lift");
        reachTrain.setDeskripsi("Cara gerakan : Turunkan badan dengan bertumpu pada siku dan lutut dengan telapak tangan dan jari kaki menyentuh lantai, lalu biarkan punggung atas melengkung. Lalu jaga lengan tetap tertekuk pada siku dan rapat di sisi tubuh, lalu julurkan satu lengan ke depan sambil memutar telapak tangan menghadap ke atas. Secara perlahan kembali ke posisi awal untuk mengulang gerakan pada sisi tubuh lainnya.\n\nManfaat gerakan : Melatih punggung bagian atas, otot deltoid dan pinggul.");
        reachTrain.setGambar("https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AATJ2t.img?m=1&b=black&w=867&h=488&f=jpeg&q=60");
        allTrainings.add(reachTrain);

        LatihanModel pilatesTrain = new LatihanModel();
        pilatesTrain.setNama("Pilates Roll-up with Ball");
        pilatesTrain.setDeskripsi("Cara gerakan : Berbaring di lantai dengan bola Pilates diletakkan di bawah tumit. Rentangkan kedua lengan di atas kepala dengan telapak tangan saling berhadapan. Dengan tetap menjaga kaki tegak lurus dan bertumpu pada bola, geser lengan secara perlahan ke depan dan angkat bahu dari lantai sebelum menurunkan badan ke posisi. \n\nManfaat gerakan : Melatih Otot perut, Otot Bokong, Hamstring, Tubuh Total");
        pilatesTrain.setGambar("https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AATnV6.img?m=1&b=black&w=867&h=488&f=jpeg&q=60");
        allTrainings.add(pilatesTrain);

        LatihanModel pikesTrain = new LatihanModel();
        pikesTrain.setNama("Plank Pikes");
        pikesTrain.setDeskripsi("Cara gerakan : Mulai dalam posisi plank dengan bertumpu pada siku yang berada tepat di bawah bahu dan kaki terbuka selebar pinggul. Pastikan tubuh Anda membentuk garis lurus sepenuhnya dari bahu hingga pergelangan kaki. Kencangkan otot perut dan angkat pinggul setinggi mungkin, berhenti sejenak di posisi puncak sebelum kembali turun ke posisi awal. \n\nManfaat gerakan : Melatih Perut, Pinggul, Punggung");
        pikesTrain.setGambar("https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AATtmA.img?m=1&b=black&w=867&h=488&f=jpeg&q=60");
        allTrainings.add(pikesTrain);

        LatihanModel oneTrain = new LatihanModel();
        oneTrain.setNama("Walkout from Pushup");
        oneTrain.setDeskripsi("Cara gerakan : Mulai dalam posisi push-up dengan merentangkan tangan selebar bahu di lantai. Tubuh harus membentuk garis lurus dari bahu hingga kaki. Gerakkan tangan ke depan melewati kepala sejauh mungkin tanpa membiarkan pinggul turun. Gerakkan tangan kembali ke posisi awal. \n\nManfaat gerakan : Melatih Perut, Otot Deltoid, Trisep");
        oneTrain.setGambar("https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AATDQH.img?m=1&b=black&w=867&h=488&f=jpeg&q=60");
        allTrainings.add(oneTrain);

        LatihanModel twoTrain = new LatihanModel();
        twoTrain.setNama("Standing T-rotation balance");
        twoTrain.setDeskripsi("Cara gerakan : Berdiri tegak dan condong ke depan pada pinggang, dengan mengangkat satu kaki ke atas dan merentangkannya di belakang sambil membusungkan dada, sehingga membentuk garis lurus dari kaki hingga kepala dan huruf 'T' dengan badan. Rentangkan kedua lengan lurus di hadapan Anda, telapak tangan saling menghadap. Ini adalah posisi awal Anda. Secara perlahan buka satu lengan, dengan memutarnya ke atas dan memutar posisi dada. Turunkan lengan secara terkontrol dan kembali ke posisi awal bentuk 'T' tanpa menurunkan kaki yang direntangkan. \n\nManfaat gerakan : Melatih Perut, Kuadrisep, Otot Bokong, Tubuh Total");
        twoTrain.setGambar("https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AATdrc.img?m=1&b=black&w=867&h=488&f=jpeg&q=60");
        allTrainings.add(twoTrain);

        LatihanModel threeTrain = new LatihanModel();
        threeTrain.setNama("Inching Elbow Plank");
        threeTrain.setDeskripsi("Cara gerakan : Mulai dalam posisi plank dengan siku tepat di bawah bahu, lengan bawah di lantai, dan kaki terentang selebar pinggul. Kencangkan otot perut dan angkat pinggul saat melangkah kecil ke depan dengan kaki sambil menjaga posisi siku tidak berubah. Setelah itu, melangkah ke belakang secara perlahan untuk kembali ke posisi awal. \n\nManfaat gerakan : Melatih Perut, Pinggul, Punggung, Bahu");
        threeTrain.setGambar("https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AATytw.img?m=1&b=black&w=867&h=488&f=jpeg&q=60");
        allTrainings.add(threeTrain);

        LatihanModel fourTrain = new LatihanModel();
        fourTrain.setNama("Modified Mountain Climber");
        fourTrain.setDeskripsi("Cara gerakan : Mulai dengan posisi plank, turunkan lutut dengan memastikan pemusatan berat badan bertumpu pada tangan. Luruskan satu kaki di belakang Anda dengan menahan lutut lainnya di lantai. Tekuk kaki yang dibuka dan keluarkan ke arah bahu di sisi yang sama. Lutut akan sejajar dengan lantai. Lakukan gerakan sebaliknya dan kembali ke posisi awal sambil menahan kaki terangkat. Lakukan gerakan pengulangan, lalu lanjutkan dengan sisi lainnya. \n\nManfaat gerakan : Melatih Perut, Otot Bokong, Pinggul");
        fourTrain.setGambar("https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AATB9P.img?m=1&b=black&w=867&h=488&f=jpeg&q=60");
        allTrainings.add(fourTrain);

        LatihanModel fiveTrain = new LatihanModel();
        fiveTrain.setNama("Kneeling Superman");
        fiveTrain.setDeskripsi("Cara gerakan : Posisikan tubuh dengan bertumpu pada tangan dan lutut. Gunakan matras jika perlu untuk kenyamanan. Pastikan posisi punggung tetap rata dan kencangkan otot. Ulurkan satu lengan ke depan sambil merentangkan kaki pada sisi tubuh yang berlawanan lurus ke belakang. Tahan posisi, lalu kembali ke posisi awal untuk melakukan gerakan yang sama pada sisi lainnya. \n\nManfaat gerakan : Melatih Perut, Otot Bokong, Pinggul, Hamstring, Bahu");
        fiveTrain.setGambar("https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AATBFw.img?m=1&b=black&w=867&h=488&f=jpeg&q=60");
        allTrainings.add(fiveTrain);

        LatihanModel sixTrain = new LatihanModel();
        sixTrain.setNama("Two-Point Plank");
        sixTrain.setDeskripsi("Cara gerakan : Posisikan badan dengan siku dan jari kaki menyentuh lantai, dengan siku tetap berada tepat di bawah bahu. Angkat pinggul hingga membentuk garis lurus dari bahu hingga kaki. Kencangkan otot perut dan tarik otot bokong. Tanpa membiarkan tubuh berputar, angkat dan rentangkan satu lengan dan kaki di sisi yang berlawanan secara bersamaan hingga berada sejajar dengan lantai. Kembali ke posisi awal, lalu ulangi gerakan dengan mengangkat lengan dan kaki lainnya. \n\nManfaat gerakan : Melatih Oblique, Otot Deltoid");
        sixTrain.setGambar("https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AATJ11.img?m=1&b=black&w=867&h=488&f=jpeg&q=60");
        allTrainings.add(sixTrain);

        LatihanModel sevenTrain = new LatihanModel();
        sevenTrain.setNama("Straight-arm Plank");
        sevenTrain.setDeskripsi("Cara gerakan : Ambil posisi push-up di lantai dengan lengan berada tepat di bawah bahu dan pinggul membentuk garis lurus mulai dari bahu hingga kaki. Kencangkan otot inti tubuh dan tahan selama waktu yang disarankan. \n\nManfaat gerakan : Melatih Otot Dada, Otot Deltoid, Trisep, Perut");
        sevenTrain.setGambar("https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AATtbm.img?m=1&b=black&w=867&h=488&f=jpeg&q=60");
        allTrainings.add(sevenTrain);

        LatihanModel eightTrain = new LatihanModel();
        eightTrain.setNama("Weighted Plank");
        eightTrain.setDeskripsi("Cara gerakan : Minta bantuan teman untuk meletakkan pelat beban secara perlahan pada punggung Anda. Pastikan pinggul tidak turun dengan adanya beban tambahan ini. Tahan posisi ini selama waktu yang disarankan. \n\nManfaat gerakan : Melatih Perut, Otot Deltoid, Dada, Trisep");
        eightTrain.setGambar("https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AAT8dU.img?m=1&b=black&w=867&h=488&f=jpeg&q=60");
        allTrainings.add(eightTrain);

        LatihanModel nineTrain = new LatihanModel();
        nineTrain.setNama("Swiss Ball Plank");
        nineTrain.setDeskripsi("Cara gerakan : Dengan kaki menapak lantai, letakkan siku pada Swiss ball. Angkat pinggul dari lantai hingga membentuk garis lurus dari bahu hingga kaki. Kencangkan otot perut dan tarik otot bokong. Tahan posisi ini selama waktu yang disarankan. \n\nManfaat gerakan : Melatih Perut, Otot Deltoid, Dada, Trisep");
        nineTrain.setGambar("https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AATtdB.img?m=1&b=black&w=867&h=488&f=jpeg&q=60");
        allTrainings.add(nineTrain);

        LatihanModel tenTrain = new LatihanModel();
        tenTrain.setNama("Extended Plank");
        tenTrain.setDeskripsi("Cara gerakan : Ambil posisi push up dengan tangan berada sekitar 20 cm di depan bahu. Pastikan tubuh membentuk garis lurus dari pergelangan kaki hingga bahu. Tahan otot inti tubuh dan kencangkan otot bokong. Tahan posisi ini. \n\nManfaat gerakan : Melatih Perut, Bahu, Punggung");
        tenTrain.setGambar("https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AATvUE.img?m=1&b=black&w=867&h=488&f=jpeg&q=60");
        allTrainings.add(tenTrain);
    }

    public static ArrayList<LatihanModel> getAllTrainings() {
        return allTrainings;
    }

    public static void setAllTrainings(ArrayList<LatihanModel> allTrainings) {
        Utils.allTrainings = allTrainings;
    }

    public static ArrayList<JadwalModel> getUsersPlan() {
        return usersPlan;
    }

    public static void setUsersPlan(ArrayList<JadwalModel> usersPlan) {
        Utils.usersPlan = usersPlan;
    }

    public static boolean addUsersPlan(JadwalModel plan){
        return usersPlan.add(plan);
    }

    public static boolean removeUsersPlan(JadwalModel plan){
        return usersPlan.remove(plan);
    }


}
