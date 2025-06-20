package TypeRacer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> rareContestant = new ArrayList<>();
    private ArrayList<Result> rareStanding = new ArrayList<>();
    
    private long startTime;

    public String getWordsToType() {
        return wordsToType;
    }

    public ArrayList<Typer> getRareContestant() {
        return rareContestant;
    }

    // Bisa diganti sesuai keinginan masing-masing
    private String[] wordsToTypeList = {
            "Di Bikini Bottom ada Spongebob Squarepants, dia memang keren suka main drumband",
            "Dia jadi koki masaknya krabby patty, menjalani hari hidup bersama Garry",
            "Ayo sama-sama sebutkan nama-nama makhluk dalam sana di Bikini Bottom jaya",
            "Namun ada juga namanya Patrick Star, walau dia cetar tapi hidupnya liar",
            "Tinggal dalam batu tapi suka membantu, sayang hanya satu otaknya itu buntu"
    };

    public void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(wordsToTypeList.length);
        wordsToType = wordsToTypeList[angkaRandom];
    }

    // TODO (4)
    // Buat method addResult yang mana digunakan untuk menambahkan typer yang
    // telah selesai (mengetik semua kata), ke dalam list race standing.

    public synchronized void addResult(Result r) {
        rareStanding.add(r);
    }

    public synchronized long recordFinish(String botName) {
        long elapsed = (System.currentTimeMillis() - startTime) / 1000;
        return elapsed;
    }

    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=========================\n");

        // TODO (5)
        // Tampilkan klasemen akhir dari kompetisi, dengan format
        // {posisi}. {nama} = {waktu penyelesaian dalam detik} detik

        rareStanding.sort(Comparator.comparing(Result::getFinishTime));

        int pos = 1;
        for (Result r : rareStanding) {
            System.out.printf("%d. %s = %d detik%n", pos++, r.getName(), r.getFinishTime());
        }
    }

    public void startRace() {
        // TODO (6)
        // Jalankan kompetisi untuk tiap kontestan
        startTime = System.currentTimeMillis();
        for (Typer t : rareContestant) {
            t.start();
        }
    }

    // TODO (7)
    // selama semua peserta belum selesai maka tampilkan typing progress-nya setiap
    // 2 detik, dengan format:
    // Typing Progress ...
    // ===================
    // {nama kontestan} => {text yang telah dia ketik}
    // {nama kontestan} => {text yang telah dia ketik}
    // {nama kontestan} => {text yang telah dia ketik}
    public void displayRaceStandingPeriodically() throws InterruptedException {
        boolean allDone = false;
        while (!allDone) {
            System.out.println("\nTyping Progres ...");
            System.out.println("===================");
            for (Typer t : rareContestant) { 
                System.out.printf("%s => %s%n", t.getBotName(), t.getWordsTyped());
            }

            allDone = rareContestant.stream().allMatch(t -> t.getWordsTyped().contains("(Selesai)"));
            Thread.sleep(2000);
        }

        // TODO (8)
        // Setelah semua typer selesai, tampilkan race standing setelah semua typer
        // selesai

        printRaceStanding();
    }
}