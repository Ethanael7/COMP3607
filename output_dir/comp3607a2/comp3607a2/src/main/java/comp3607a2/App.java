package comp3607a2;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main( String[] args ){
        QuizRecord studentJ_log = load();
        //System.out.println(studentJ_log);
    

    System.out.println("Traversal #1: By Alphabetical");
        printAlphabeticalTraversal(studentJ_log.createAlphabeticalIterator());

        System.out.println("\nTraversal #2: By Correct Alphabetical");
        printCorrectTraversal(studentJ_log.createCorrectIterator());

        System.out.println("\nTraversal #3: By Duration");
        printDurationTraversal(studentJ_log.createDurationIterator());

        System.out.println("\nTraversal #4: By Fluency");
        printFluencyTraversal(studentJ_log.createFluencyIterator());

        System.out.println("\nTraversal #5: By Backspace");
        printErrorCorrectionTraversal(studentJ_log.createErrorCorrectionIterator());
    }

    public static QuizRecord load( ){
        QuizRecord studentJ_log = new QuizRecord();
        studentJ_log.addSpellingAttempt(wordMillenium());
        studentJ_log.addSpellingAttempt(wordFurniture());
        studentJ_log.addSpellingAttempt(wordAwful());
        studentJ_log.addSpellingAttempt(wordBandit());
        studentJ_log.addSpellingAttempt(wordTrickery());
        studentJ_log.addSpellingAttempt(wordStrangers());
        studentJ_log.addSpellingAttempt(wordLettuce());
        studentJ_log.addSpellingAttempt(wordFarewell());
        studentJ_log.addSpellingAttempt(wordFinger());
        studentJ_log.addSpellingAttempt(wordRegret());
        studentJ_log.addSpellingAttempt(wordKidnapping());
        studentJ_log.addSpellingAttempt(wordHorizon());
        return studentJ_log;
    }

    public static SpellingAttempt wordAwful(){
        SpellingAttempt s1 = new SpellingAttempt( "awful", "awful","7226",true,"API - British");
        s1.addStudentAction(new StudentAction(null,"awful","1646232464390"," ClickInTextField"));
        s1.addStudentAction(new StudentAction(null,"awful","1646232467074"," ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"awful","1646232467286"," PressPlayButton"));
        s1.addStudentAction(new StudentAction(null,"awful","1646232470917"," ClickInTextField"));
        s1.addStudentAction(new StudentAction("a","awful","1646232471454"," TypeInTextField"));
        s1.addStudentAction(new StudentAction("aw","awful","1646232471819"," TypeInTextField"));
        s1.addStudentAction(new StudentAction("awf","awful","1646232472572"," TypeInTextField"));
        s1.addStudentAction(new StudentAction("awfu","awful","1646232473151"," TypeInTextField"));
        s1.addStudentAction(new StudentAction("awful","awful","1646232473460"," TypeInTextField"));
        s1.addStudentAction(new StudentAction(null,"awful","1646232475459"," ClickOutOfTextField"));
        return s1;
    }
    public static SpellingAttempt wordBandit(){
        SpellingAttempt s1 = new SpellingAttempt( "bandit", "bandit","131586",true,"API - British");
        s1.addStudentAction(new StudentAction(null,"bandit", "1646232475684", " ClickInTextField" ));
        s1.addStudentAction(new StudentAction(null,"bandit", "1646232477559", " ClickOutOfTextField" ));
        s1.addStudentAction(new StudentAction(null,"bandit", "1646232477773", " PressPlayButton" ));
        s1.addStudentAction(new StudentAction(null,"bandit", "1646232479096", " PressPlayButton" ));
        s1.addStudentAction(new StudentAction(null,"bandit", "1646232481312", " ClickInTextField" ));
        s1.addStudentAction(new StudentAction("b", "bandit", "1646232481862", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("ba", "bandit", "1646232482282", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("ban", "bandit", "1646232482867", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("band", "bandit", "1646232483446", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("bandi", "bandit", "1646232484001", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("bandit", "bandit", "1646232484482", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction(null,"bandit", "1646232485953", " ClickOutOfTextField " ));
        s1.addStudentAction(new StudentAction(null,"bandit", "1646232662072", " ClickInTextField " ));
        s1.addStudentAction(new StudentAction(null,"bandit", "1646232777695", " ClickOutOfTextField " ));
        s1.addStudentAction(new StudentAction(null,"bandit", "1646232778082", " ClickOutOfTextField " ));
        s1.addStudentAction(new StudentAction(null,"bandit", "1646232787529", " ClickOutOfTextField "));
        return s1;
    }
    public static SpellingAttempt wordFurniture(){
        SpellingAttempt s1 = new SpellingAttempt( "furniture", "furniture","3312836",true,"API - British");
        s1.addStudentAction(new StudentAction(null,"furniture", "1646232436538", " PressPlayButton"));
        s1.addStudentAction(new StudentAction(null,"furniture", "1646232438377", " PressPlayButton"));
        s1.addStudentAction(new StudentAction(null,"furniture", "1646232455057", " ClickInTextField"));
        s1.addStudentAction(new StudentAction(null,"furniture", "1646232457118", " ClickInTextField"));
        s1.addStudentAction(new StudentAction("f", "furniture", "1646232457910", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("fu", "furniture", "1646232459077", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("fur", "furniture", "1646232459899", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("furn", "furniture", "1646232460356", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("furni", "furniture", "1646232460856", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("furnit", "furniture", "1646232461389", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("furnitu", "furniture", "1646232461757", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("furnitur", "furniture", "1646232462121", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("furniture", "furniture", "1646232462465", " TypeInTextField"));
        s1.addStudentAction(new StudentAction(null,"furniture", "1646232464172", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"furniture", "1646232801573", " ClickInTextField"));
        s1.addStudentAction(new StudentAction(null,"furniture", "1646232803448", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"furniture", "1646232821318", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"furniture", "1646232834913", " ClickInTextField"));
        s1.addStudentAction(new StudentAction(null,"furniture", "1646232995397", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"furniture", "1646233037478", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"furniture", "1646233038590", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"furniture", "1646234007636", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"furniture", "1646236795489", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"furniture", "1646236853211", " ClickInTextField"));
        s1.addStudentAction(new StudentAction(null,"furniture", "1646236859266", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"furniture", "1646236859478", " PressSubmitButton"));
        return s1;
    }
    public static SpellingAttempt wordMillenium(){
        SpellingAttempt s1 = new SpellingAttempt( "millennium", "milliem","55526",false,"API - British");  
        s1.addStudentAction(new StudentAction(null,"millennium", "1646232423557", " PressPlayButton"));
        s1.addStudentAction(new StudentAction(null,"millennium", "1646232425066", " ClickInTextField"));
        s1.addStudentAction(new StudentAction("f", "millennium", "1646232426384", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("fu", "millennium", "1646232427841", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("fur", "millennium", "1646232428571", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("furn", "millennium", "1646232429297", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("furni", "millennium", "1646232429697", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("furnit", "millennium", "1646232430406", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("furnitu", "millennium", "1646232430972", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("furnitur", "millennium", "1646232431367", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("furniturw", "millennium", "1646232431690", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("furnitur", "millennium", "1646232432681", " Backspace"));
        s1.addStudentAction(new StudentAction("furniture", "millennium", "1646232434822", " TypeInTextField"));
        s1.addStudentAction(new StudentAction(null,"millennium", "1646232436322", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"millennium", "1646232441055", " PressPlayButton"));
        s1.addStudentAction(new StudentAction(null,"millennium", "1646232443668", " ClickInTextField"));
        s1.addStudentAction(new StudentAction("furnitur", "millennium", "1646232444109", " Backspace"));
        s1.addStudentAction(new StudentAction("furnitur=", "millennium", "1646232444314", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("furnitur==", "millennium", "1646232444534", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("furnitur=", "millennium", "1646232444559", " Backspace"));
        s1.addStudentAction(new StudentAction("furnitur", "millennium", "1646232444856", " Backspace"));
        s1.addStudentAction(new StudentAction("furnitu", "millennium", "1646232445469", " Backspace"));
        s1.addStudentAction(new StudentAction("furnit", "millennium", "1646232445508", " Backspace"));
        s1.addStudentAction(new StudentAction("furni", "millennium", "1646232445545", " Backspace"));
        s1.addStudentAction(new StudentAction("furn", "millennium", "1646232445580", " Backspace"));
        s1.addStudentAction(new StudentAction("fur", "millennium", "1646232445619", " Backspace"));
        s1.addStudentAction(new StudentAction("fu", "millennium", "1646232445653", " Backspace"));
        s1.addStudentAction(new StudentAction("f", "millennium", "1646232445690", " Backspace"));
        s1.addStudentAction(new StudentAction("", "millennium", "1646232445729", " Backspace"));
        s1.addStudentAction(new StudentAction("m", "millennium", "1646232446440", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("mi", "millennium", "1646232446750", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("mil", "millennium", "1646232447071", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("mill", "millennium", "1646232447631", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("milli", "millennium", "1646232448143", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("millim", "millennium", "1646232448828", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("millimu", "millennium", "1646232449220", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("millimum", "millennium", "1646232451570", " TypeInTextField"));
        
        s1.addStudentAction(new StudentAction(null,"millennium", "1646232454841", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"millennium", "1646232787752", " ClickInTextField"));
        s1.addStudentAction(new StudentAction("millimu", "millennium", "1646232788485", " Backspace"));
        s1.addStudentAction(new StudentAction("millim", "millennium", "1646232788721", " Backspace"));
        s1.addStudentAction(new StudentAction("milli", "millennium", "1646232788930", " Backspace"));
        s1.addStudentAction(new StudentAction("mill", "millennium", "1646232789238", " Backspace"));
        s1.addStudentAction(new StudentAction(null,"millennium", "1646232791674", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"millennium", "1646232791889", " PressPlayButton"));
        s1.addStudentAction(new StudentAction(null,"millennium", "1646232793072", " PressPlayButton"));
        s1.addStudentAction(new StudentAction(null,"millennium", "1646232794977", " ClickInTextField"));
        s1.addStudentAction(new StudentAction("mil", "millennium", "1646232795423", " Backspace"));
        s1.addStudentAction(new StudentAction("mili", "millennium", "1646232796829", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("milim", "millennium", "1646232797419", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("milimu", "millennium", "1646232798429", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("milimum", "millennium", "1646232798964", " TypeInTextField"));       
        s1.addStudentAction(new StudentAction(null,"millennium", "1646232801351", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"millennium", "1646232821532", " ClickInTextField"));
        s1.addStudentAction(new StudentAction("milimu", "millennium", "1646232822031", " Backspace"));
        s1.addStudentAction(new StudentAction("milim", "millennium", "1646232822243", " Backspace"));
        s1.addStudentAction(new StudentAction("mili", "millennium", "1646232822539", " Backspace"));
        s1.addStudentAction(new StudentAction("mil", "millennium", "1646232822798", " Backspace"));
        s1.addStudentAction(new StudentAction("mi", "millennium", "1646232823152", " Backspace"));
        s1.addStudentAction(new StudentAction("mil", "millennium", "1646232825419", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("mill", "millennium", "1646232825710", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("mille", "millennium", "1646232827267", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("millen", "millennium", "1646232829539", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("millenn", "millennium", "1646232829797", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("millenni", "millennium", "1646232830245", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("millenniu", "millennium", "1646232832983", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("millennium", "millennium", "1646232833349", " TypeInTextField"));         
        s1.addStudentAction(new StudentAction(null,"millennium", "1646232834694", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"millennium", "1646236843348", " ClickInTextField"));
        s1.addStudentAction(new StudentAction("millenniu", "millennium", "1646236843856", " Backspace"));
        s1.addStudentAction(new StudentAction("millenni", "millennium", "1646236844072", " Backspace"));
        s1.addStudentAction(new StudentAction("millenn", "millennium", "1646236844316", " Backspace"));
        s1.addStudentAction(new StudentAction("millen", "millennium", "1646236844548", " Backspace"));
        s1.addStudentAction(new StudentAction("mille", "millennium", "1646236844783", " Backspace"));
        s1.addStudentAction(new StudentAction("mill", "millennium", "1646236845058", " Backspace"));
        s1.addStudentAction(new StudentAction("mil", "millennium", "1646236845297", " Backspace"));
        s1.addStudentAction(new StudentAction("mill", "millennium", "1646236848056", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("milli", "millennium", "1646236848455", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("millie", "millennium", "1646236849256", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("milliem", "millennium", "1646236849865", " TypeInTextField"));
        s1.addStudentAction(new StudentAction(null,"millennium", "1646236852987", " ClickOutOfTextField"));   
        return s1;
    }

    public static SpellingAttempt wordTrickery(){
        SpellingAttempt s1 = new SpellingAttempt( "trickery", "trickrey","30845",false,"API - British");
        s1.addStudentAction(new StudentAction(null,"trickery", "1646232486175", " ClickInTextField" ));
        s1.addStudentAction(new StudentAction(null,"trickery", "1646232488119", " ClickOutOfTextField" ));
        s1.addStudentAction(new StudentAction(null,"trickery", "1646232488345", " PressPlayButton" ));
        s1.addStudentAction(new StudentAction(null,"trickery", "1646232490263", " ClickInTextField" ));
        s1.addStudentAction(new StudentAction("t", "trickery", "1646232490984", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("tr", "trickery", "1646232491271", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("tri", "trickery", "1646232491691", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("trik", "trickery", "1646232492617", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("trikr", "trickery", "1646232493382", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("trikre", "trickery", "1646232493710", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("trikrey", "trickery", "1646232494073", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction(null,"trickery", "1646232496204", " ClickInTextField" ));
        s1.addStudentAction(new StudentAction("trikirey", "trickery", "1646232496931", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction(null,"trickery", "1646232498288", " ClickOutOfTextField" ));
        s1.addStudentAction(new StudentAction(null,"trickery", "1646232544471", " ClickInTextField" ));
        s1.addStudentAction(new StudentAction("trikire", "trickery", "1646232544859", " Backspace" ));
        s1.addStudentAction(new StudentAction("trikir", "trickery", "1646232545060", " Backspace" ));
        s1.addStudentAction(new StudentAction("triki", "trickery", "1646232545295", " Backspace" ));
        s1.addStudentAction(new StudentAction("trik", "trickery", "1646232545440", " Backspace" ));
        s1.addStudentAction(new StudentAction("tri", "trickery", "1646232545741", " Backspace" ));
        s1.addStudentAction(new StudentAction("tric", "trickery", "1646232547152", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("trick", "trickery", "1646232547789", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("trickr", "trickery", "1646232549787", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("trickre", "trickery", "1646232550553", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("trickrey", "trickery", "1646232551035", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction(null,"trickery", "1646232552219", " ClickOutOfTextField" ));
        s1.addStudentAction(new StudentAction(null,"trickery", "1646232650652", " ClickInTextField" ));
        s1.addStudentAction(new StudentAction("trickre", "trickery", "1646232651942", " Backspace" ));
        s1.addStudentAction(new StudentAction("trickr", "trickery", "1646232652036", " Backspace" ));
        s1.addStudentAction(new StudentAction("trick", "trickery", "1646232652459", " Backspace" ));
        s1.addStudentAction(new StudentAction("tric", "trickery", "1646232652739", " Backspace" ));
        s1.addStudentAction(new StudentAction("trick", "trickery", "1646232657036", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("tricke", "trickery", "1646232659021", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("tricker", "trickery", "1646232659401", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("trickery", "trickery", "1646232659821", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction(null,"trickery", "1646232661851", " ClickOutOfTextField" ));
        s1.addStudentAction(new StudentAction(null,"trickery", "1646236796492", " ClickInTextField" ));
        s1.addStudentAction(new StudentAction("tricker", "trickery", "1646236797222", " Backspace" ));
        s1.addStudentAction(new StudentAction("tricke", "trickery", "1646236797226", " Backspace" ));
        s1.addStudentAction(new StudentAction("trick", "trickery", "1646236797229", " Backspace" ));
        s1.addStudentAction(new StudentAction("tric", "trickery", "1646236797785", " Backspace" ));
        s1.addStudentAction(new StudentAction("tri", "trickery", "1646236798121", " Backspace" ));
        s1.addStudentAction(new StudentAction("tr", "trickery", "1646236798444", " Backspace" ));
        s1.addStudentAction(new StudentAction("tri", "trickery", "1646236799742", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("tric", "trickery", "1646236800236", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("trick", "trickery", "1646236800752", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("trickr", "trickery", "1646236801365", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("trickre", "trickery", "1646236801653", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction("trickrey", "trickery", "1646236802194", " TypeInTextField" ));
        s1.addStudentAction(new StudentAction(null,"trickery", "1646236804162", " ClickOutOfTextField"));
        return s1;
    }

    public static SpellingAttempt wordStrangers(){      
        SpellingAttempt s1 = new SpellingAttempt( "strangers", "strangers","23646",true,"API - British");
        s1.addStudentAction(new StudentAction(null,"strangers", "1646232498502", " ClickInTextField "));
        s1.addStudentAction(new StudentAction(null,"strangers", "1646232506727", " ClickInTextField "));
        s1.addStudentAction(new StudentAction(null,"strangers", "1646232508378", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"strangers", "1646232508600", " PressPlayButton "));
        s1.addStudentAction(new StudentAction(null,"strangers", "1646232510610", " ClickInTextField"));
        s1.addStudentAction(new StudentAction("s", "strangers", "1646232511183", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("st", "strangers", "1646232511840", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("str", "strangers", "1646232513062", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("stra", "strangers", "1646232513389", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("stran", "strangers", "1646232513949", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("strang", "strangers", "1646232514382", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("strangr", "strangers", "1646232514707", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("strang", "strangers", "1646232515439", " Backspace"));
        s1.addStudentAction(new StudentAction("strange", "strangers", "1646232517097", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("stranger", "strangers", "1646232517468", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("strangers", "strangers", "1646232518047", " TypeInTextField"));
        s1.addStudentAction(new StudentAction(null,"strangers", "1646232520293", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"strangers", "1646232552436", " ClickInTextField "));
        s1.addStudentAction(new StudentAction(null,"strangers", "1646232559471", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"strangers", "1646236804368", " ClickInTextField "));
        s1.addStudentAction(new StudentAction(null,"strangers", "1646236809645", " ClickOutOfTextField"));
        return s1;
    }   

    public static SpellingAttempt wordLettuce(){      
        SpellingAttempt s1 = new SpellingAttempt( "lettuce", "lettuce","7632",true,"API - British");
        s1.addStudentAction(new StudentAction(null,"lettuce", "1646232520516", " PressPlayButton"));
        s1.addStudentAction(new StudentAction(null,"lettuce", "1646232522196", " ClickInTextField"));
        s1.addStudentAction(new StudentAction("l", "lettuce", "1646232523001", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("le", "lettuce", "1646232523614", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("let", "lettuce", "1646232524056", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("lett", "lettuce", "1646232524302", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("lettu", "lettuce", "1646232524799", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("lettuc", "lettuce", "1646232525398", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("lettuce", "lettuce", "1646232525698", " TypeInTextField"));
        s1.addStudentAction(new StudentAction(null,"lettuce", "1646232529828", " ClickOutOfTextField"));
        return s1;
    }

    public static SpellingAttempt wordFarewell(){ 
        SpellingAttempt s1 = new SpellingAttempt( "farewell", "farewell","10845",true,"API - British");
        s1.addStudentAction(new StudentAction(null,"farewell", "1646232531425", " ClickInTextField"));
        s1.addStudentAction(new StudentAction(null,"farewell", "1646232532487", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"farewell", "1646232532700", " PressPlayButton"));
        s1.addStudentAction(new StudentAction(null,"farewell", "1646232534462", " ClickInTextField"));
        s1.addStudentAction(new StudentAction("f", "farewell", "1646232535127", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("fa", "farewell", "1646232535533", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("far", "farewell", "1646232535918", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("fare", "farewell", "1646232536208", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("farew", "farewell", "1646232537027", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("farewe", "farewell", "1646232537315", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("farewel", "farewell", "1646232538823", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("farewell", "farewell", "1646232539131", " TypeInTextField"));
        s1.addStudentAction(new StudentAction(null,"farewell", "1646232544245", " ClickOutOfTextField"));
        return s1;
    }   

    public static SpellingAttempt wordFinger(){ 
        SpellingAttempt s1 = new SpellingAttempt( "finger", "finger","3949",true,"API - British");
        s1.addStudentAction(new StudentAction(null,"finger", "1646232563460", " ClickInTextField"));
        s1.addStudentAction(new StudentAction("f", "finger", "1646232564183", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("fi", "finger", "1646232564625", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("fin", "finger", "1646232564993", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("fing", "finger", "1646232565372", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("finge", "finger", "1646232565732", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("finger", "finger", "1646232565980", " TypeInTextField"));
        s1.addStudentAction(new StudentAction(null,"finger", "1646232567409", " ClickOutOfTextField"));
        return s1;
    } 

    public static SpellingAttempt wordRegret(){ 
        SpellingAttempt s1 = new SpellingAttempt( "regret", "regret","9583",true,"API - British");
        s1.addStudentAction(new StudentAction(null,"regret", "1646232569601", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"regret", "1646232569818", " PressPlayButton"));
        s1.addStudentAction(new StudentAction(null,"regret", "1646232571908", " ClickInTextField"));
        s1.addStudentAction(new StudentAction("r", "regret", "1646232572757", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("re", "regret", "1646232573011", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("reg", "regret", "1646232573850", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("regr", "regret", "1646232574210", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("regre", "regret", "1646232574502", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("regret", "regret", "1646232574836", " TypeInTextField"));
        s1.addStudentAction(new StudentAction(null,"regret", "1646232579519", " ClickOutOfTextField"));
        return s1;
    }   

    public static SpellingAttempt wordKidnapping(){ 
        SpellingAttempt s1 = new SpellingAttempt( "kidnapping", "kidnapping","60468",true,"API - British");
        s1.addStudentAction(new StudentAction(null,"kidnapping", "1646232581437", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"kidnapping", "1646232581659", " PressPlayButton"));
        s1.addStudentAction(new StudentAction(null,"kidnapping", "1646232584182", " ClickInTextField"));
        s1.addStudentAction(new StudentAction("k", "kidnapping", "1646232585062", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("ki", "kidnapping", "1646232585339", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("kid", "kidnapping", "1646232586213", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("kidn", "kidnapping", "1646232586683", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("kidna", "kidnapping", "1646232587108", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("kidnap", "kidnapping", "1646232587741", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("kidnapp", "kidnapping", "1646232587963", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("kidnappi", "kidnapping", "1646232589055", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("kidnappin", "kidnapping", "1646232589479", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("kidnapping", "kidnapping", "1646232589821", " TypeInTextField"));
        s1.addStudentAction(new StudentAction(null,"kidnapping", "1646232592868", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"kidnapping", "1646232603995", " ClickInTextField"));
        s1.addStudentAction(new StudentAction(null,"kidnapping", "1646232605408", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"kidnapping", "1646232628034", " ClickInTextField"));
        s1.addStudentAction(new StudentAction(null,"kidnapping", "1646232632184", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"kidnapping", "1646232650440", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"kidnapping", "1646236825394", " ClickInTextField"));
        s1.addStudentAction(new StudentAction(null,"kidnapping", "1646236827046", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"kidnapping", "1646236839083", " ClickInTextField"));
        s1.addStudentAction(new StudentAction(null,"kidnapping", "1646236843145", " ClickOutOfTextField"));
        return s1;
    }   
    
    public static SpellingAttempt wordHorizon(){ 
        SpellingAttempt s1 = new SpellingAttempt( "horizon", "horizon","50851",true,"API - British");
        s1.addStudentAction(new StudentAction(null,"horizon", "1646232594107", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"horizon", "1646232594331", " PressPlayButton"));
        s1.addStudentAction(new StudentAction(null,"horizon", "1646232596619", " ClickInTextField"));
        s1.addStudentAction(new StudentAction("h", "horizon", "1646232597330", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("ho", "horizon", "1646232597731", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("hor", "horizon", "1646232598548", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("hori", "horizon", "1646232599252", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("horiz", "horizon", "1646232600518", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("horize", "horizon", "1646232600841", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("horizen", "horizon", "1646232601366", " TypeInTextField"));
        s1.addStudentAction(new StudentAction(null,"horizon", "1646232603780", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"horizon", "1646232605631", " ClickInTextField"));
        s1.addStudentAction(new StudentAction("horize", "horizon", "1646232605982", " Backspace"));
        s1.addStudentAction(new StudentAction("horiz", "horizon", "1646232606205", " Backspace"));
        s1.addStudentAction(new StudentAction("hori", "horizon", "1646232606398", " Backspace"));
        s1.addStudentAction(new StudentAction("hor", "horizon", "1646232606790", " Backspace"));
        s1.addStudentAction(new StudentAction(null,"horizon", "1646232608289", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction("hori", "horizon", "1646232622191", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("horiz", "horizon", "1646232623222", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("horizi", "horizon", "1646232624513", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("horiz", "horizon", "1646232625141", " Backspace"));
        s1.addStudentAction(new StudentAction("horizo", "horizon", "1646232625548", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("horizon", "horizon", "1646232625940", " TypeInTextField"));
        s1.addStudentAction(new StudentAction(null,"horizon", "1646232627809", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"horizon", "1646236809854", " ClickInTextField"));
        s1.addStudentAction(new StudentAction("horizo", "horizon", "1646236810936", " Backspace"));
        s1.addStudentAction(new StudentAction("horiz", "horizon", "1646236811209", " Backspace"));
        s1.addStudentAction(new StudentAction("hori", "horizon", "1646236811414", " Backspace"));
        s1.addStudentAction(new StudentAction("hor", "horizon", "1646236811607", " Backspace"));
        s1.addStudentAction(new StudentAction("ho", "horizon", "1646236811817", " Backspace"));
        s1.addStudentAction(new StudentAction("hoi", "horizon", "1646236813372", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("hoir", "horizon", "1646236813851", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("hoirz", "horizon", "1646236815972", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("hoir", "horizon", "1646236818231", " Backspace"));
        s1.addStudentAction(new StudentAction("hoi", "horizon", "1646236818519", " Backspace"));
        s1.addStudentAction(new StudentAction("ho", "horizon", "1646236818952", " Backspace"));
        s1.addStudentAction(new StudentAction("hor", "horizon", "1646236819786", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("hori", "horizon", "1646236820532", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("horiz", "horizon", "1646236822087", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("horizo", "horizon", "1646236822546", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("horizon", "horizon", "1646236822897", " TypeInTextField"));
        s1.addStudentAction(new StudentAction(null,"horizon", "1646236825188", " ClickOutOfTextField"));
        s1.addStudentAction(new StudentAction(null,"horizon", "1646236827242", " ClickInTextField"));
        s1.addStudentAction(new StudentAction("horizo", "horizon", "1646236827605", " Backspace"));
        s1.addStudentAction(new StudentAction("horiz", "horizon", "1646236827792", " Backspace"));
        s1.addStudentAction(new StudentAction("hori", "horizon", "1646236827959", " Backspace"));
        s1.addStudentAction(new StudentAction("hor", "horizon", "1646236828126", " Backspace"));
        s1.addStudentAction(new StudentAction("ho", "horizon", "1646236828322", " Backspace"));
        s1.addStudentAction(new StudentAction("h", "horizon", "1646236828526", " Backspace"));
        s1.addStudentAction(new StudentAction("", "horizon", "1646236828741", " Backspace"));
        s1.addStudentAction(new StudentAction("h", "horizon", "1646236830393", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("ho", "horizon", "1646236830745", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("hor", "horizon", "1646236831168", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("hori", "horizon", "1646236831642", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("horiz", "horizon", "1646236832573", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("horizo", "horizon", "1646236833606", " TypeInTextField"));
        s1.addStudentAction(new StudentAction("horizon", "horizon", "1646236834085", " TypeInTextField"));
        s1.addStudentAction(new StudentAction(null,"horizon", "1646236838876", " ClickOutOfTextField"));
        return s1;
    }


    public static void printAlphabeticalTraversal(SpellIterator iterator) {
    List<SpellingAttempt> tempList = new ArrayList<>();
    
        while (iterator.hasNext()) {
            tempList.add(iterator.next());
        }
        System.out.println("Number of elements in iteration: " + tempList.size());

        for (SpellingAttempt attempt : tempList) {
            System.out.println(attempt.getSpellingWord());
        }
}
    
    public static void printCorrectTraversal(SpellIterator iterator) {
        List<SpellingAttempt> tempList = new ArrayList<>();
    
        while (iterator.hasNext()) {
            SpellingAttempt attempt = iterator.next();
            if (attempt.isCorrect()) {
                tempList.add(attempt);
            }
        }
        System.out.println("Number of elements in iteration: " + tempList.size());
    
        for (SpellingAttempt attempt : tempList) {
            System.out.println(attempt.getSpellingWord());
        }
    }
    

    public static void printDurationTraversal(SpellIterator iterator) {
        List<SpellingAttempt> tempList = new ArrayList<>();
    
        while (iterator.hasNext()) {
            tempList.add(iterator.next());
        }
        System.out.println("Number of elements in iteration: " + tempList.size());
    
        for (SpellingAttempt attempt : tempList) {
            System.out.println(attempt.getSpellingWord() + " " + attempt.getDuration());
        }
    }
    

    public static void printFluencyTraversal(SpellIterator iterator) {
        List<SpellingAttempt> tempList = new ArrayList<>();
    
        while (iterator.hasNext()) {
            SpellingAttempt attempt = iterator.next();
            int fluencyScore = attempt.getFluency();
            if (fluencyScore < 1.9) {
                tempList.add(attempt);
            }
        }
        System.out.println("Number of elements in iteration: " + tempList.size());
    
        for (SpellingAttempt attempt : tempList) {
            System.out.println(attempt.getSpellingWord() + "  " + attempt.getSteps());
        }
    }
    

    public static void printErrorCorrectionTraversal(SpellIterator iterator) {
        List<SpellingAttempt> tempList = new ArrayList<>();
    
        while (iterator.hasNext()) {
            SpellingAttempt attempt = iterator.next();
            if (attempt.getBackspaceCount() >= 1) {
                tempList.add(attempt);
            }
        }
        System.out.println("Number of elements in iteration: " + tempList.size());
        for (SpellingAttempt attempt : tempList) {
            System.out.println(attempt.getSpellingWord() + " " + attempt.getBackspaceCount());
        }
    }
    
   
}
