package paladin;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * @author OldTeaOwl
 */
public class Main {

public static void main(String[] args) {
    int potions = 2;
    int sword = 1;
    double speed = 0;
    double buffer_speed = 0;
    double defence = 0;
    double friend_defence = 0;
    double buffer_defence = 0;
    double attak = 0;
    double buffer_attak = 0;
    double damage = 10;
    double hp = 100;
    double friend_hp = 70;
    double Maximillian_hp = 70;
    double guardian_hp = 50;
    double guardian_attak = 10;
    double guardian_damage = 10;
    double Maximillian_damage = 10;
    double guardian_defence = 10;
    double guardian_speed = 20;
    double monster_hp = 50;
    double monster_base_hp = 50;
    double monster_attak = 10;
    double monster_damage = 10;
    double monster_defence = 10;
    double monster_speed = 20;
    double current_damage = 0;
    double monster_buffer_attak = 10;
    double monster_buffer_defence = 10;
    double monster_buffer_speed = 20;
    double monster_current_damage = 0;
    double blocked_damage = 0;
    double monster_blocked_damage = 0;
    double guardian_blocked_damage = 0;
    int choose;
    int goblinsLeft = 6;
    int goblinsKilled = 0;
    int guardiansLeft = 6;
    int healed_hp = 0;
    int AuroraAction = 1;
    int GuardianAction = 1;
    int MaximillianAction = 1;
    boolean isAuroraHitted = false;
    boolean isMaximillianHitted = false;
    boolean isGuardianHitted = false;
    boolean isLetterSend = false;
    boolean isWin = false;
    boolean isArmourPikedUp = false;
    String name;
    String flang = "левый";
    String answer;
    Random rand = new Random();
    int metadata;
name = JOptionPane.showInputDialog(null,"Доброго времени суток, воин Солнца и Света!"
                                 + "\nНазови себя!");
choose = JOptionPane.showConfirmDialog(null,"Здравствуй, " + name + "!"
                                 + "\nЛегионы сил тьмы идут сюда."
                                 + "\nТолько с твоей помощью мы сможем"
                                 + "\nзащитить этот мир от вечных мук "
                                 + "\nтьмы под гнётом исчадий зла."
                                 + "\nГотов ли ты сражаться?");
if(choose == JOptionPane.OK_OPTION){
JOptionPane.showMessageDialog(null,"Отлично!");
choose = Integer.parseInt(JOptionPane.showInputDialog(null,"Какой уровень сложности выберешь?"
                                          + "\n1)- Послушник(Легко)"
                                          + "\n2)- Рыцарь(Средне)"
                                          + "\n3)- Паладин(Сложно)"
                                          + "\nP.S. Введи номер ответа"));
if(choose==1){
    monster_base_hp=15;
    monster_attak = 5;
    monster_damage = 10;
    monster_defence = 5;
    monster_speed = 10;
    goblinsLeft = 18;
    guardiansLeft = 6;
}
if(choose==2){
    monster_base_hp=30;
    monster_attak = 15;
    monster_damage = 10;
    monster_defence = 10;
    monster_speed = 20;
    goblinsLeft = 12;
    guardiansLeft = 9;
}
if(choose==3){
    monster_base_hp = 50;
    monster_attak = 25;
    monster_damage = 15;
    monster_defence = 25;
    monster_speed = 25;
    goblinsLeft = 12;
    guardiansLeft = 12;
}
JOptionPane.showMessageDialog(null,"Итак, сейчас раннее утро. В твое окно влетает голубь с"
                                 + "\nписьмом. Ты вскрываешь его.");
JOptionPane.showMessageDialog(null,"'Брат "+name+"! Нам срочно нужна твоя помощь!"
                                 + "\nНаши разведчики докладывают о массовых вспышках"
                                 + "\nтёной энергии - кто-то или что-то объединяет"
                                 + "\nармии тьмы.Действовать надо немедленно!"
                                 + "\nЖду твоего скорейшего ответа"
                                 + "\nМаксимилиан'");
JOptionPane.showMessageDialog(null,"'Брат Максимилиан!"
                                 + "\nХорошо, до Немус-Мортема всего несколько"
                                 + "\nдней верхом. Просто не дай им "
                                 + "\nдобраться до тебя, я в пути!"
                                 + "\n"+name+"'");
choose = Integer.parseInt(JOptionPane.showInputDialog(null,"Нет времени медлить!"
                                      + "\nТы идёшь в оружейню ордена за мечём."
                                      + "\nКакой выбрать?"
                                      + "\n1)- Драгмир"
                                      + "\n2)- Слейпнир"
                                      + "\n3)- Мортиферо-Селли"
                                      + "\n(P.S. напиши порядковый номер меча)"));
if(choose == 1){
JOptionPane.showMessageDialog(null,"Чёрный Драгмир."
                                 + "\nХороший выбор."
                                 + "\nЭтот меч вселяет животный ужас"
                                 + "\nв сердца орков и гоблинов, и "
                                 + "\nудивительно удобен в руке");
attak = 20;
defence = 5;
speed = 10;
}
 else if(choose == 2){
JOptionPane.showMessageDialog(null,"Слейпнир. Меч из стали, калёной"
                                 + "\nнапрямую магией солнца - великолепно"
                                 + "\nсбалансирован для защиты. Пусть он"
                                 + "\nлишён золотых гравировок и инкрустации,"
                                 + "\nно лучшего меча не сыскать во всех"
                                 + "\nсеверных землях, и сопредельных государствах.");
attak = 10;
defence = 20;
speed = 5;
 }
 else if (choose == 3){
JOptionPane.showMessageDialog(null,"Мортиферо-Селли. Никто не знает, что это"
                                 + "\nза оружие. Ни одна раса, даже самая магически"
                                 + "\nодарённая не способна так зачаровать клинок."
                                 + "\nЕго лезвие в идеальном состоянии, но маги "
                                 + "\nордена говорят, что оно помнит миллионы "
                                 + "\nпронзённых врагов, и вскрывает зачарованную"
                                 + "\nброню как консервы."
                                 + "\nЧто примечательно, рукоять не сохранила"
                                 + "\nни одного магического следа руки владельца.");
attak = 5;
defence = 20;
speed = 10;
 }
sword = choose;
choose = Integer.parseInt(JOptionPane.showInputDialog(null,"Время выбрать броню."
                                      + "\nЛёгкая не стесняет движений в бою, а"
                                      + "\nтяжёлая гарантированно сохранит твою"
                                      + "\nжизнь. Какую выберешь?"
                                      + "\n1)- Плащ и полукираса(легк.)"
                                      + "\n2)- Кираса(лёгк.)"
                                      + "\n3)- Кираса и щитки(тяж.)"
                                      + "\n4)- Латы(тяж.)"));
}
if(choose == 1){
JOptionPane.showMessageDialog(null,"Отлично, теперь мало кто "
                                 + "\nуследит за твоим смертоносным лезвием,"
                                 + "\nи при этом нагрудник всё ещё вполне"
                                 + "\nспособен отразить клинок врага.");
defence = defence + 10;
speed = speed + 20;
}
if(choose == 2){
JOptionPane.showMessageDialog(null,"Разумный компромисс между защитой и"
                                 + "\nскоростью, в пользу второго");
defence = defence + 13;
speed = speed + 17;
}
if(choose == 3){
JOptionPane.showMessageDialog(null,"Разумный компромисс между защитой и"
                                 + "\nскоростью, в пользу первого");
defence = defence + 17;
speed = speed + 13;
}
if(choose == 4){
JOptionPane.showMessageDialog(null,"Эти тяжёлые кованные латы превращают"
                                 + "\nтебя в ходячую крепость, неумолимо"
                                 + "\nсокрушающую всё, на своём пути."
                                 + "\nПусть медленно, но неотвратимо.");
defence = defence + 20;
speed = speed + 10;
}
JOptionPane.showMessageDialog(null,"В путь! Каждая минута дорога - "
                                 + "\nМаксимилиан - маг ордена в приграничной"
                                 + "\nкрепости Немус-Мортем, и его могущества"
                                 + "\nдостаточно, чтобы он и его люди"
                                 + "\nуже много лет успешно защищали границы от орков,"
                                 + "\nгоблинов, и троллей. Если он обратился за"
                                 + "\nпомощью, значит дело из рук вон плохо.");
JOptionPane.showMessageDialog(null,"Прошло несколько дней пути."
                                 + "\nТы подъезжаешь к Сумеречному Лесу."
                                 + "\nЗа ним - Немус-Мортем,но идти придётся"
                                 + "\nпешком - заросли слишком густые для"
                                 + "\nконя.");

choose = Integer.parseInt(JOptionPane.showInputDialog(null,"Ты легко бегом преодолеваешь густые"
                                 + "\nзаросли, следуя едва заметной тропе."
                                 + "\nВнезапно, слева слышен звук. "
                                 + "\n1)- Проверить что там"
                                 + "\n2)- Игнорировать"));
if(choose == 1){
JOptionPane.showMessageDialog(null,"Кто бы это ни был, он ушёл."
                                 + "\nТрава примята. Он ждал тут чуть ли не "
                                 + "\nнесколько часов. Не обязательно засада,"
                                 + "\nи маловероятно, что именно для тебя,"
                                 + "\nно определённо нужно быть на чеку.");
}
    else if(choose == 2){
JOptionPane.showMessageDialog(null,"Воозможно, это были животные, или оползень."
                                 + "\nмало ли что беспокоит старый зачарованный лес?"
                                 + "\nТы бежишь дальше, время не терпит.");
}
JOptionPane.showMessageDialog(null,"Сгущаются сумерки, но останавливаться нет необходимости -"
                                 + "\nты получишь кров и еду как только прибудешь в Немус-Мортем");
choose = Integer.parseInt(JOptionPane.showInputDialog(null,"Звук в зарослях. Снова."
                                 + "\n1)- Проверить что там"
                                 + "\n2)- Игнорировать"));
if(choose == 1){
    if(sword==1){
JOptionPane.showMessageDialog(null,"Ты достаёшь из-за пояса Драгмир."
                                 + "\nТвой чёрный клинок сама тень смерти в"
                                 + "\nсумерках зачарованого леса. И не ты один"
                                 + "\nэто чувствуешь.");}
    if(sword==2){
JOptionPane.showMessageDialog(null,"Ты достаёшь Слейпнир из ножен."
                                 + "\nНе дай Солнце и Звёзды, существу в кустах"
                                 + "\nоказаться враждебным - клинок Паладина - "
                                 + "\nпоследнее, что оно увидит перед смерью.");}

    if(sword==3){
JOptionPane.showMessageDialog(null,"Ты достаёшь из ножен свой Мортиферо-Селли."
                                 + "\nКлинок приветствует тебя мелодичным звоном,"
                                 + "\nи мягкое свечение лезвия разгоняет мрак сумерек.");}
}
    else if(choose == 2){
JOptionPane.showMessageDialog(null,"К чёрту! Ты держишь путь дальше, в крепость.");
}
JOptionPane.showMessageDialog(null,"На тропу выходит тень. Огромная мускулистая"
                                 + "\nантропоморфная тварь. Она явно дождалась сумерек,"
                                 + "\nпрежде чем напасть. К оружию!");

while(monster_hp>0&&hp>0){
choose = Integer.parseInt(JOptionPane.showInputDialog(null,"Оборотень атакует!"
                                                         + "\nОн пытается ударить тебя"
                                                         + "\nкогтями, твои действия?"
                                                         + "\n1)- Ударить его мечём"
                                                         + "\n2)- Ударить латной перчаткой"
                                                         + "\n3)- Защититься"
                                                         + "\n4)- Пнуть ногой в грудь"
                                                         + "\n5)- Выпить зелье лечения (x"+potions+")"
                                                         + "\nP.S. Удары латной перчаткой"
                                                         + "\nили сапогом могут оглушить врага"));
if(rand.nextInt((int)(100-speed))!=1){
monster_current_damage = (monster_attak/100)*monster_damage + rand.nextInt((int)monster_damage) + 2;
monster_blocked_damage = monster_damage*(defence/100);
hp = hp - (monster_current_damage - monster_blocked_damage);
    }
 else{
 monster_current_damage = 0;
 monster_blocked_damage = 0;
 JOptionPane.showMessageDialog(null,"Тебе удалось уклонится от выпада твари!");
 }
if(rand.nextInt((int)(100-monster_speed))!=1){
if(choose==1){
current_damage = (attak/100)*damage + rand.nextInt((int)damage) + 2;
blocked_damage = current_damage*(monster_defence/100);
monster_hp = monster_hp - (current_damage - blocked_damage);
}
if(choose==2){
    if(rand.nextInt(3)!=1){
current_damage = rand.nextInt((int)damage);
blocked_damage = current_damage*(monster_defence/100);
monster_hp = monster_hp - (current_damage - blocked_damage);
}else{
 monster_current_damage = 0;
 monster_blocked_damage = 0;
 blocked_damage = 0;
 JOptionPane.showMessageDialog(null,"Своей тяжёлой латной перчаткой ты"
                                  + "\nсбиваешь тварь на землю!");
}
}
if(choose == 3){
monster_current_damage = monster_current_damage - monster_blocked_damage*2;
}
if(choose == 4){
if(rand.nextBoolean()){
 monster_current_damage = 0;
 monster_blocked_damage = 0;
 blocked_damage = 0;
choose = Integer.parseInt(JOptionPane.showInputDialog(null,"Ты сбил врага с ног! "
                                                         + "\n1)- Добить"
                                                         + "\n2)- Дать подняться и продолжить поединок"
                                                         + "\n(Противник теряет половину текущей жизни)"
                                                         + "\nP.S. Добить = мгновенная победа"));
if(choose == 1){
monster_hp = 0;
}
if(choose == 2){
JOptionPane.showMessageDialog(null,"Ты поступил как истинный Паладин - воин Солнца и Света,"
                                 + "\nблагородство - жизненно важное качество! Да "
                                 + "\nпродолжится честный поединок рыцаря и зверя!");
monster_hp = monster_hp - monster_hp/2;
}
}
}
if(choose == 5){
hp = hp + 50;
JOptionPane.showMessageDialog(null,"Магический отвар восстановил тебе 50"
                                 + "\nединиц здоровья!");
}
}else{
current_damage = 0;
blocked_damage = 0;
JOptionPane.showMessageDialog(null,"Зверь увернулся от удара!");
}
JOptionPane.showMessageDialog(null,"Ты нанёс "+(int)current_damage+" урона,"
                                 + "\nПротивник нанёс тебе "+(int)monster_current_damage
                                 + "\nИз них ты заблокировал " + (int)monster_blocked_damage
                                 + "\nА противник "+(int)blocked_damage
                                 + "\nТеперь у него "+(int)monster_hp+" жизни,"
                                 + "\nУ тебя "+(int)hp+" жизни.");
    }

if(hp>0){
JOptionPane.showMessageDialog(null,"Твой смертоносный клинок оборвал "
                                 + "\nжалкое существование этого отвратительного"
                                 + "\nпорождения чёрной магии, великая победа!");
}else{
JOptionPane.showMessageDialog(null,"Тварь вгрызается тебе в горло, и "
                                 + "\nтерзает плоть огромными окровавлеными клыками."
                                 + "\nНемус-Мортем не встретит своего героя."
                                 + "\nПопробуешь ещё раз?");
System.exit(0);
}
choose = Integer.parseInt(JOptionPane.showInputDialog(null,"Ты стал сильнее!"
                                                         + "\n(Ввыбери, в чём именно!) "
                                                         + "\n- Атака: "+(int)attak+"%(+30)"
                                                         + "\n- Защита: "+(int)defence+"%(+15)"
                                                         + "\n- Скорость: "+(int)speed+"%(+15)"
                                                         + "\nP.S. Информация(можно не читать)"
                                                         + "\nАтака - коэффицент "
                                                         + "\nусиления урона(может превышать 100%)"
                                                         + "\nЗащита - коэффицент отражения урона"
                                                         + "\n(не может превышать 100%)"
                                                         + "\nСкорость - шанс уклонится от удара"
                                                         + "\n(не может превышать 100%)"));
if(choose==1){
attak = attak + 30;
JOptionPane.showMessageDialog(null,"Теперь твоя атака - "+(int)attak+"!");
}
if(choose==2){
defence = defence + 15;
JOptionPane.showMessageDialog(null,"Теперь твоя защита - "+(int)defence+"!");
}
if(choose==3){
speed = speed + 15;
JOptionPane.showMessageDialog(null,"Теперь твоя скорость - "+(int)speed+"!");
}
JOptionPane.showMessageDialog(null,"Со всех концов леса к тебе приближаются "
                                 + "\nпятна света, и раздаются отвратительные хриплые "
                                 + "\nвозгласы");
JOptionPane.showMessageDialog(null,"Гоблины!");
JOptionPane.showMessageDialog(null,"Эти грязные слуги теней не ходят по одному. "
                                 + "\nНужно срочно найти укрытие, пока их не "
                                 + "\nнабежала целая армия! Бегом!");
JOptionPane.showMessageDialog(null,"Чёрт, огни загораются со всех сторон!"
                                 + "\nПока ещё далеко, но похоже, эти "
                                 + "\nсущества уже загоняют тебя в западню, как"
                                 + "\nдикого зверя.");
JOptionPane.showMessageDialog(null,"Ты видишь вспышки магического света,"
                                 + "\nвсего в паре миль отсюда! Гоблины"
                                 + "\nне владеют магией, а следовательно,"
                                 + "\nнеизвестный маг сражающийся с ними "
                                 + "\nможет стать серьёзным союзником! Туда!");
JOptionPane.showMessageDialog(null,"Осталось немого, вспышки уже совсем близко!");
JOptionPane.showMessageDialog(null,"Ты вбегаешь на поляну, окружённую ровным частоколом"
                                 + "\nвековых сосен. В центре стоит чародейка-послушница"
                                 + "\nтвоего ордена! Магические искры срываются с её пальцев -"
                                 + "\nэто готовое заклинание. Её окружает больше дюжины гоблинов!"
                                 + "\nОдна она несомненно погибнет - послушники ордена не знают"
                                 + "\nсильных боевых заклинаний - только проклятия, защиту и "
                                 + "\nлечение, её нужно увести отсюда! Вперёд!");
for(int i = 0; i<6; i++){
monster_hp=monster_base_hp;
if(buffer_attak!=0){
buffer_attak = 0;
attak = attak - buffer_attak;
//monster_damage
}
if(buffer_defence!=0){
buffer_defence = 0;
defence = defence - buffer_defence;
}
if(buffer_speed!=0){
buffer_speed = 0;
speed = speed - buffer_speed;
}
while(monster_hp>0&&hp>0&&friend_hp>0){
choose = Integer.parseInt(JOptionPane.showInputDialog(null,"Гоблин кидается на вас с Авророй,"
                                                         + "\nзащищайтесь!"
                                                         + "\n1)- Ударить его мечём"
                                                         + "\n2)- Ударить латной перчаткой"
                                                         + "\n3)- Защитить Аврору своим щитом"
                                                         + "\n4)- Пнуть ногой в грудь"
                                                         + "\n5)- Выпить зелье лечения (x"+potions+")"
                                                         + "\nP.S. Удары латной перчаткой"
                                                         + "\nили сапогом могут оглушить врага"
                                                         + "\nЕсли союзник погибнет, компания будет "
                                                         + "\nпроиграна"));
AuroraAction=rand.nextInt(6);
if(AuroraAction==1&&hp<85){
healed_hp = rand.nextInt(7)+3;
hp = hp + healed_hp;
JOptionPane.showMessageDialog(null, "Аврора залечивает твои раны!(+"+healed_hp+" жизни)");
}else if(AuroraAction==1){
monster_buffer_attak = monster_attak - monster_attak/2;
JOptionPane.showMessageDialog(null, "Аврора сотворяет проклятие на противника!"
                                  + "\nЕго атака вдвое ослабла!");
}else if(AuroraAction==2){
monster_buffer_defence = monster_defence - monster_defence/2;
JOptionPane.showMessageDialog(null, "Аврора творит проклятие на противника!"
                                  + "\nЕго броня теперь вдвое слабее!");
}
else if(AuroraAction==3){
monster_buffer_speed = monster_speed - monster_speed/2;
JOptionPane.showMessageDialog(null, "Аврора замедляет противника!"
                                  + "\nЕго шанс увернуться теперь вдвое меньше!");
}
else if(AuroraAction==4){
buffer_speed = speed/3;
speed = speed + buffer_speed;
JOptionPane.showMessageDialog(null, "Аврора повышает твой шанс уклониться на "+(int)buffer_speed+"!(до конца боя)");
}
else if(AuroraAction==5){
buffer_attak = attak/3;
attak = attak + buffer_attak;
JOptionPane.showMessageDialog(null, "Аврора повышает твою атаку на "+(int)buffer_attak+"!(до конца боя)");
}
else if(AuroraAction==6&& friend_hp<65){
healed_hp = rand.nextInt(7)+3;
friend_hp = friend_hp + healed_hp;
JOptionPane.showMessageDialog(null, "Аврора заговаривает свои раны на "+(int)healed_hp+"ед. жизни");
}
else if(AuroraAction==6){
buffer_defence = defence/3;
defence = defence + buffer_defence;
JOptionPane.showMessageDialog(null, "Аврора повышает прочность твоей брони на "+(int)buffer_attak+"!(до конца боя)");
}
isAuroraHitted = rand.nextBoolean();
if(!isAuroraHitted){
if(rand.nextInt((int)(100 - speed))!=1){
monster_current_damage = (monster_attak/100)*monster_damage + rand.nextInt((int)monster_damage) + 2;
monster_blocked_damage = monster_damage*(defence/100);
hp = hp - (monster_current_damage - monster_blocked_damage);
    }
 else{
 monster_current_damage = 0;
 monster_blocked_damage = 0;
 JOptionPane.showMessageDialog(null,"Тебе удалось уклонится от кривого меча гоблина!");
 }
    }else{
monster_current_damage = (monster_buffer_attak/100)*monster_damage + rand.nextInt((int)monster_damage) + 2;
monster_blocked_damage = monster_damage - (rand.nextInt((int)monster_damage));
friend_hp = friend_hp - (monster_current_damage - monster_blocked_damage);
    }
if(rand.nextInt((int)monster_speed)!=1){
if(choose==1){
current_damage = (attak/100)*damage + rand.nextInt((int)damage) + 2;
blocked_damage = current_damage*(monster_defence/100);
monster_hp = monster_hp - (current_damage - blocked_damage);
}
if(choose==2){
    if(rand.nextInt(3)!=1){
current_damage = rand.nextInt((int)damage);
blocked_damage = current_damage*(monster_buffer_defence/100);
monster_hp = monster_hp - (current_damage - blocked_damage);
}else{
 monster_current_damage = 0;
 monster_blocked_damage = 0;
 blocked_damage = 0;
 JOptionPane.showMessageDialog(null,"Своей тяжёлой латной перчаткой ты"
                                  + "\nоглушаешь гоблина! Он пошатнулся, и"
                                  + "\nпропустил момент, когда мог нанести удар.");
}
}
if(choose == 3){
monster_current_damage = rand.nextInt(((int)(hp/2 - hp*defence/100)));
current_damage = rand.nextInt((int)monster_hp);
JOptionPane.showMessageDialog(null,"В последний момент ты закрываешь Аврору щитом,"
                                 + "\nа после стремительно контратакуешь!"
                                 + "\nТы получил "+monster_current_damage+" урона,"
                                 + "\nа противник получил "+current_damage+" урона!");
}
if((choose == 4)&&(rand.nextInt((int)(100 - monster_speed))==1)){
if(rand.nextBoolean()){
 monster_current_damage = 0;
 monster_blocked_damage = 0;
 blocked_damage = 0;
choose = Integer.parseInt(JOptionPane.showInputDialog(null,"Ты сбил врага с ног! "
                                                         + "\n1)- Добить"
                                                         + "\n2)- Дать подняться и продолжить поединок"
                                                         + "\n(Противник теряет половину текущей жизни)"
                                                         + "\nP.S. Добить = мгновенная победа"));
if(choose == 1){
monster_hp = 0;
break;
}
if(choose == 2){
JOptionPane.showMessageDialog(null,"Ты поступил как истинный Паладин - воин Солнца и Света,"
                                 + "\nблагородство - жизненно важное качество! "
                                 + "\nЧёрный гоблин и белый рыцарь - продолжим же битву!");
monster_hp = monster_hp - monster_hp/2;
}
}
}
if(choose == 5){
hp = hp + 50;
JOptionPane.showMessageDialog(null,"Магический отвар восстановил тебе 50"
                                 + "\nединиц здоровья!");
}
}else{
current_damage = 0;
blocked_damage = 0;
JOptionPane.showMessageDialog(null,"Гоблин увернулся от удара!");
}
if(!isAuroraHitted){
JOptionPane.showMessageDialog(null,"Ты нанёс "+(int)current_damage+" урона,"
                                 + "\nПротивник нанёс тебе "+(int)monster_current_damage+" урона,"
                                 + "\nИз них ты заблокировал " + (int)monster_blocked_damage+" урона"
                                 + "\nА противник "+(int)blocked_damage+" урона"
                                 + "\nТеперь у него "+(int)monster_hp+" жизни,"
                                 + "\nУ тебя "+(int)hp+" жизни.");
    }else{
    JOptionPane.showMessageDialog(null,"Гоблин атакует твою союзницу!"
                                 + "\nТы запоздало бьёшь его, и наносишь "+(int)current_damage+" урона,"
                                 + "\nНо он уже нанёс Авроре "+(int)monster_current_damage+" урона,"
                                 + "\nИз них она отразила магическим полем " + (int)monster_blocked_damage+" урона"
                                 + "\nНо и противник защитился на "+(int)blocked_damage + " единиц урона"
                                 + "\nТеперь у него "+(int)monster_hp+" жизни,"
                                 + "\nУ тебя "+(int)hp+" жизни,"
                                 + "\nА у Авроры " +(int)friend_hp+".");
    }
}
if(friend_hp<=0){
JOptionPane.showMessageDialog(null,"Хрупкая Аврора Чиаро падает, пронзённая клинком гоблина."
                                 + "\nО чёрт.. Этого не должно было случится, "
                                 + "\nПопробуешь ещё раз?");
System.exit(0);
}
if(hp>0){
JOptionPane.showMessageDialog(null,"Этот гоблин мёртв! Осталось ещё "+(6-i));
}else{
    if(rand.nextBoolean()){
JOptionPane.showMessageDialog(null,"Чёрный кривой клинок гоблина пробил твою броню."
                                 + "\nМир погружается во тьму..."
                                 + "\nНет, нет! Этого не должно было случиться!"
                                 + "\n"+name+", не сдавайся! Ещё раз!");
System.exit(0);}
    else{
JOptionPane.showMessageDialog(null,"Ты пропустил удар, и чёрное лезвие обезглавливает"
                                 + "\nтебя. Последнее, что ты слышишь - крик Авроры."
                                 + "\nО Солнце и Звёзды.. "
                                 + "\nПопробуй ещё раз, ладно?");
System.exit(0);
}
}
if(buffer_attak!=0){
buffer_attak = 0;
attak = attak - buffer_attak;
}
if(buffer_defence!=0){
buffer_defence = 0;
defence = defence - buffer_defence;
}
if(buffer_speed!=0){
buffer_speed = 0;
speed = speed - buffer_speed;
}
monster_buffer_attak = monster_attak;
monster_buffer_defence = monster_defence;
monster_buffer_speed = monster_speed;
}
choose = Integer.parseInt(JOptionPane.showInputDialog(null,"Ты стал сильнее!"
                                                         + "\n(Ввыбери, в чём именно!) "
                                                         + "\n- Атака: "+(int)attak+"%(+30)"
                                                         + "\n- Защита: "+(int)defence+"%(+15)"
                                                         + "\n- Скорость: "+(int)speed+"%(+15)"
                                                         + "\nP.S. Информация(можно не читать)"
                                                         + "\nАтака - коэффицент "
                                                         + "\nусиления урона(может превышать 100%)"
                                                         + "\nЗащита - коэффицент отражения урона"
                                                         + "\n(не может превышать 100%)"
                                                         + "\nСкорость - шанс уклонится от удара"
                                                         + "\n(не может превышать 100%)"));
if(choose==1){
attak = attak + 30;
JOptionPane.showMessageDialog(null,"Теперь твоя атака - "+(int)attak+"!");
}
if(choose==2){
defence = defence + 15;
JOptionPane.showMessageDialog(null,"Теперь твоя защита - "+(int)defence+"!");
}
if(choose==3){
speed = speed + 15;
JOptionPane.showMessageDialog(null,"Теперь твоя скорость - "+(int)speed+"!");
}
JOptionPane.showMessageDialog(null,"Все гоблины мертвы, победа!"
                                 + "\nДо крепости совсем чуть-чуть, похоже,"
                                 + "\nвы с новой спутницей пробили брешь в облаве,"
                                 + "\nи теперь можете пройти, пока противник не"
                                 + "\nпонял, что произошло, вперёд!");
JOptionPane.showMessageDialog(null,"Вы быстро достигаете окраины леса."
                                 + "\nТы ещё не знешь, кто твоя спутница,"
                                 + "\nно похоже, ей можно доверять.");
JOptionPane.showMessageDialog(null,"Вот и крепостные стены!");
JOptionPane.showMessageDialog(null,"Вы подбегаете к воротам, и машете руками,"
                                 + "\nдабы привлечь вниманеи стражи на стенах - "
                                 + "\nгоблины обязательно кинутся в погоню,"
                                 + "\nнужно спешить. Более того, их в лесу уже"
                                 + "\nдовольно много, и будучи обнаруженными, они"
                                 + "\nмогут начать рискованный штурм, пока есть"
                                 + "\nпреимущество неожиданности.");
JOptionPane.showMessageDialog(null,"За воротами слышится какое-то движение,"
                                 + "\nпохоже, вас заметили.");
JOptionPane.showMessageDialog(null,"Страж ворот: "
                                 + "\n-Крепость на военной готовности по личному приказу"
                                 + "\nмагистра Максимилиана, уходите, здесь небезопасно.");
JOptionPane.showMessageDialog(null,name+": Я, "+name+", Рыцарь Солнца и Света требую "
                                   + "\nправа войти в крепость.");
JOptionPane.showMessageDialog(null,"Страж ворот: Хорошо, назови пароль.");
JOptionPane.showMessageDialog(null,name+": Я не знаю пароля!");
JOptionPane.showMessageDialog(null,"Страж ворот: Тогда, я задам тебе всего один вопрос."
                                 + "\nЕсли ты тот, за кого себя выдаёшь, то знаешь"
                                 + "\nна него ответ.");
JOptionPane.showMessageDialog(null,"Страж ворот: Итак, вопрос таков: кто ты?"
                                 + "\nP.S. Это всего одно слово, и оно не связано"
                                 + "\nс твоим именем или статусом - это слово -"
                                 + "\nсуть воина Солнца и Света, а так же его"
                                 + "\nтитул, и то имя, под которым любого рыцаря"
                                 + "\nОрдена знают простолюдины. Кто ты?");
answer = JOptionPane.showInputDialog(null,"Я - ...");
int i = 1;
while(!answer.equals("Паладин")){
JOptionPane.showMessageDialog(null,"Страж ворот: Нет. Попробуй ещё раз.");
if(i==2){
JOptionPane.showMessageDialog(null,"Подсказка#1: Это название твоего ордена");
}else if(i==4){
JOptionPane.showMessageDialog(null,"Подсказка#2: Это название этой игры");
}else if(i==6){
JOptionPane.showMessageDialog(null,"Подсказка#3: Ответ - 'Паладин'");
}
answer = JOptionPane.showInputDialog(null,"Я - ...");
i++;
}
JOptionPane.showMessageDialog(null,"Страж ворот: Проходи, добро пожаловать в Немус-Мортем!");
JOptionPane.showMessageDialog(null,"Ты сразу направляешься к Максимилиану - надо предупредить"
                                 + "\nего о том, что в лесах за крепостными стенами скрывается"
                                 + "\nцелая армия, и даже если они не рискнут напасть на такие"
                                 + "\nмощные укрепления, то это вполне весомая причина предполагать,"
                                 + "\nчто ими управляет гораздо более опасный противник.");
JOptionPane.showMessageDialog(null,"Пройдя сквозь лабиринты крепостной цитадели, ты попадаешь"
                                 + "\nв Зал Совещаний. Похоже, Макисмилиана предупредили о твоём"
                                 + "\nприбытии - он уже ждал тебя.");
JOptionPane.showMessageDialog(null,"Максимилиан: Здравствуй, "+name+"! "
                                 + "\nТы всё таки приехал, да ещё и не один! Представишь"
                                 + "\nли ты мне свою спутницу?");
JOptionPane.showMessageDialog(null,name+": Максимиллиан! Вечность тебя не видел, брат!"
                                      + "\nУдвой караулы, и прикажи принести вина - мы с"
                                      + "\nэтой юной волшебницей только что пробились "
                                      + "\nсквозь облаву гоблинов в лесу");
JOptionPane.showMessageDialog(null,"Максимилиан: Гоблины? Так близко?"
                                 + "\nЯ знал, что силы тьмы собираются неподалёку,"
                                 + "\nно это уже слишком..");
JOptionPane.showMessageDialog(null,"Максимилиан: И более того, нас очень невовремя"
                                 + "\nпостигла неудача - на несколько дней назад,"
                                 + "\nво время бхода удалённых сторожевых постов пропал"
                                 + "\nкомандующий стражей. Похоже, теперь ситуация прояснилась.."
                                 + "\nСможешь ли ты взять на себя его обязанности, брат?");
choose=Integer.parseInt(JOptionPane.showInputDialog(null,name+":Хм, это большая ответсвенность перед орденом,"
                                                             +"но я попробую, брат"
                                                             + "\n1)- спросить об обязанностях капитана"
                                                             + "\n2)- приступить к выполнению"));
if(choose==1){
JOptionPane.showMessageDialog(null,name+":Что я должен буду делать?");
JOptionPane.showMessageDialog(null,"Максимилиан: Не очень много - расставлять и снимать караулы,"
                                 + "\nменять концентрацию войск в определённых точках, в "
                                 + "\nзависимости от ситуации, и командовать обороной крепсти в"
                                 + "\nслучае ввозможного нападения.");
}
JOptionPane.showMessageDialog(null,name+":Ладно, немного передохну после трудного пути, и "
                                       +"\nподём смотреть на твою стражу..");
JOptionPane.showMessageDialog(null,"<несколько дней спустя>");
JOptionPane.showMessageDialog(null,"Разведчик: Главнокомандующий "+name+", сэр, к стенам крепости"
                                 + "\nприближаются полчища гоблинов! Вооружённые силы Немус-Мортема"
                                 + "\nждут Ваших распоряжений!");

while(choose!=5){
choose=Integer.parseInt(JOptionPane.showInputDialog(null,name+":К оружию!!!"
                                                             + "\n1)- Запросить рапорты дозорных"
                                                             + "\n2)- Проинспектировать вооружённые силы крепости"
                                                             + "\n3)- Выслать голубей с просьбами о помощи в соседние"
                                                             + "\nкрепости"
                                                             + "\n4)- Пополнить припасы перед битвой"
                                                             + "\n5)- В атаку!"));
if(choose==1){
JOptionPane.showMessageDialog(null, "Дозорные (доклад): На крепость с трёх сторон "
                                  + "\nдвижутся ударные отряды гоблинов, а центральный сопровождает"
                                  + "\nпещерный огр - огромная сильная тварь- медленная, но очень"
                                  + "\nживучая, и сильная. Главнокомандующего атакой пока не замечено,"
                                  + "\nно он определённо лично руководит атакой - она слишком хорошо "
                                  + "\nспланирована даже для самого умного гоблина."
                                  + "\nОтряды противника насчитывают "+goblinsLeft+" с каждой стороны.");
}
if(choose==2){
JOptionPane.showMessageDialog(null,"Ты инспектируешь свои силы - "
                                 + "\n"+guardiansLeft/3+ "0 рейнджеров с луками"
                                 + "\n"+guardiansLeft/3+ "0 копейщиков"
                                 + "\n"+guardiansLeft/3+ "0 рыцарей,"
                                 + "\nне считая тебя, Максимиллиана, и Аврору."
                                 + "\nЭто будет самое тяжёлое сражение в твоей жизни -"
                                 + "\nкаждому из вас придётся биться за троих - только так"
                                 + "\nможно разбить многократно превосходящие вас"
                                 + "\nчисленностью силы врага!");
}
if(choose==3){
if(!isLetterSend){
isLetterSend = true;
JOptionPane.showMessageDialog(null,"Ты высылаешь письма, теперь осталось только продержаться"
                                 + "\nдо подхода подкреплений!");
}
else{JOptionPane.showMessageDialog(null,"Письма и так высланы, нет смысла делать это ещё раз");
}
}
if(choose==4){
    if(!isArmourPikedUp){
JOptionPane.showMessageDialog(null,name+":Быстро в оружейную - там могут быть припасы!"
                                      + "\nТы находишь 2 зелья лечения, и прочный шлем,"
                                      + "\nа так же лёгкую кирасу для Авроры - большая удача -"
                                      + "\nона может спасти жизнь юной волшебнице!");
defence = defence+5;
potions = potions+2;
friend_defence = 40;
}else{
JOptionPane.showMessageDialog(null, "Тут нет больше ничего, что могло бы тебя заинтересовать");
}
}
if(choose==5){
JOptionPane.showMessageDialog(null,name+":Все на стены, приготовится к штурму!!!");
}
}
//------------------------------------------------------------------------------
while(!isWin){
monster_hp=monster_base_hp;
while(goblinsLeft>0&&hp>0&&friend_hp>0){
    if(goblinsKilled==(goblinsLeft+goblinsKilled)/3){
    flang="правый";
    JOptionPane.showMessageDialog(null,"Ты и твои воины отбросили врага с левого фланга,"
                                     + "\nно противник жмёт кучку защитников справа,быстро туда!");
    }else if(goblinsKilled==(goblinsLeft+goblinsKilled)/3*2){
    flang="центральный";
    JOptionPane.showMessageDialog(null,"Правый фланг зачищен, осталось оборонять ворота, и отбросить гоблинов,"
                                     + "\nраньше того момента, как подойдёт их огр!");
    }
choose = Integer.parseInt(JOptionPane.showInputDialog(null,"Противник штурмует "+flang+" фланг!" 
                                                         + "\n1)- Атаковать мечём"
                                                         + "\n2)- Раскидывать врагов латной перчаткой"
                                                         + "\n3)- Защищать своих людей щитом от стрел"
                                                         + "\n4)- Попытаться сбросить со стен вниз"
                                                         + "\n5)- Выпить зелье лечения (x"+potions+")"
                                                         + "\nP.S. Удары латной перчаткой могут оглушить врага."
                                                         + "\nЕсли Аврора погибнет, компания будет "
                                                         + "\nпроиграна, солдаты могут быть убиты"));
AuroraAction=rand.nextInt(6);
MaximillianAction=rand.nextInt(6);
GuardianAction=rand.nextInt(3);
if(MaximillianAction==1){
Maximillian_damage = rand.nextInt(10)+5;
monster_hp = monster_hp - Maximillian_damage;
JOptionPane.showMessageDialog(null, "Максимиллиан метает в гоблинов огненный шар!"
                                  + "Противник получил ожоги на "+Maximillian_damage+" урона");
}
if(MaximillianAction==2&&monster_speed>0){
Maximillian_damage = rand.nextInt(10)+5;
monster_hp = monster_hp - Maximillian_damage;
metadata = rand.nextInt(5);
monster_speed=monster_speed-metadata;
JOptionPane.showMessageDialog(null, "Максимиллиан творит заклинание оледенения!"
                                  + "Противник получил "+Maximillian_damage+" урона,"
                                  + "и его скорость снижена на "+metadata+"!");
}
if(MaximillianAction==3&&rand.nextInt(10)==1){
    monster_damage=0;
    blocked_damage=0;
JOptionPane.showMessageDialog(null, "Максимиллиан ослепляет противника ярчайшей вспышкой магии солнца!"
                                  + "Противник не сможет скоординироватьсят до следующей атаки твоего отряда!");
}
if(MaximillianAction==4){
Maximillian_damage = rand.nextInt(10)+5;
monster_hp = monster_hp - Maximillian_damage;
JOptionPane.showMessageDialog(null, "Максимиллиан рубит врага мечём, нанося ему "+Maximillian_damage+" урона!");
}

if(AuroraAction==1&&hp<85){
healed_hp = rand.nextInt(7)+3;
hp = hp + healed_hp;
JOptionPane.showMessageDialog(null, "Аврора залечивает твои раны!(+"+healed_hp+" жизни)");
}else if(AuroraAction==1){
monster_buffer_attak = monster_attak - monster_attak/2;
JOptionPane.showMessageDialog(null, "Аврора сотворяет проклятие на противника!"
                                  + "\nЕго атака вдвое ослабла!");
}else if(AuroraAction==2){
monster_buffer_defence = monster_defence - monster_defence/2;
JOptionPane.showMessageDialog(null, "Аврора творит проклятие на противника!"
                                  + "\nЕго броня теперь вдвое слабее!");
}
else if(AuroraAction==3){
monster_buffer_speed = monster_speed - monster_speed/2;
JOptionPane.showMessageDialog(null, "Аврора замедляет противника!"
                                  + "\nЕго шанс увернуться теперь вдвое меньше!");
}
else if(AuroraAction==4){
buffer_speed = speed/3;
speed = speed + buffer_speed;
JOptionPane.showMessageDialog(null, "Аврора повышает твой шанс уклониться на "+(int)buffer_speed+"!(до конца боя)");
}
else if(AuroraAction==5){
buffer_attak = attak/3;
attak = attak + buffer_attak;
JOptionPane.showMessageDialog(null, "Аврора повышает твою атаку на "+(int)buffer_attak+"!(до конца боя)");
}
else if(AuroraAction==6&& friend_hp<65){
healed_hp = rand.nextInt(7)+3;
friend_hp = friend_hp + healed_hp;
JOptionPane.showMessageDialog(null, "Аврора заговаривает свои раны на "+(int)healed_hp+"ед. жизни");
}
else if(AuroraAction==6){
buffer_defence = defence/3;
defence = defence + buffer_defence;
JOptionPane.showMessageDialog(null, "Аврора повышает прочность твоей брони на "+(int)buffer_attak+"!(до конца боя)");
}
isAuroraHitted = rand.nextBoolean();
if(!isAuroraHitted){
if(rand.nextInt((int)(100 - speed))!=1){
monster_current_damage = (monster_attak/100)*monster_damage + rand.nextInt((int)monster_damage) + 2;
monster_blocked_damage = monster_damage*(defence/100);
hp = hp - (monster_current_damage - monster_blocked_damage);
    }
 else{
 monster_current_damage = 0;
 monster_blocked_damage = 0;
 JOptionPane.showMessageDialog(null,"Тебе удалось уклонится от кривого меча гоблина!");
 }
    }else{
monster_current_damage = (monster_buffer_attak/100)*monster_damage + rand.nextInt((int)monster_damage) + 2;
monster_blocked_damage = monster_damage - (rand.nextInt((int)monster_damage));
friend_hp = friend_hp - (monster_current_damage - monster_blocked_damage);
    }
if(rand.nextInt((int)monster_speed)!=1){
if(choose==1){
current_damage = (attak/100)*damage + rand.nextInt((int)damage) + 2;
blocked_damage = current_damage*(monster_defence/100);
monster_hp = monster_hp - (current_damage - blocked_damage);
}
if(choose==2){
    if(rand.nextInt(3)!=1){
current_damage = rand.nextInt((int)damage);
blocked_damage = current_damage*(monster_buffer_defence/100);
monster_hp = monster_hp - (current_damage - blocked_damage);
}else{
 monster_current_damage = 0;
 monster_blocked_damage = 0;
 blocked_damage = 0;
 JOptionPane.showMessageDialog(null,"Своей тяжёлой латной перчаткой ты"
                                  + "\nоглушаешь гоблина! Он пошатнулся, и"
                                  + "\nпропустил момент, когда мог нанести удар.");
}
}
if(choose == 3){
monster_current_damage = rand.nextInt(((int)(hp/2 - hp*defence/100)));
current_damage = rand.nextInt((int)monster_hp);
JOptionPane.showMessageDialog(null,"В последний момент ты закрываешь Аврору щитом,"
                                 + "\nа после стремительно контратакуешь!"
                                 + "\nТы получил "+monster_current_damage+" урона,"
                                 + "\nа противник получил "+current_damage+" урона!");
}
if((choose == 4)&&(rand.nextInt((int)(100 - monster_speed))==1)){
if(rand.nextBoolean()){
 monster_current_damage = 0;
 monster_blocked_damage = 0;
 blocked_damage = 0;
choose = Integer.parseInt(JOptionPane.showInputDialog(null,"Ты сбил врага с ног! "
                                                         + "\n1)- Добить"
                                                         + "\n2)- Дать подняться и продолжить поединок"
                                                         + "\n(Противник теряет половину текущей жизни)"
                                                         + "\nP.S. Добить = мгновенная победа"));
if(choose == 1){
monster_hp = 0;
break;
}
if(choose == 2){
JOptionPane.showMessageDialog(null,"Ты поступил как истинный Паладин - воин Солнца и Света,"
                                 + "\nблагородство - жизненно важное качество! "
                                 + "\nЧёрный гоблин и белый рыцарь - продолжим же битву!");
monster_hp = monster_hp - monster_hp/2;
}
}
}
if(choose == 5){
hp = hp + 50;
JOptionPane.showMessageDialog(null,"Магический отвар восстановил тебе 50"
                                 + "\nединиц здоровья!");
}
}else{
current_damage = 0;
blocked_damage = 0;
JOptionPane.showMessageDialog(null,"Гоблин увернулся от удара!");
}
if(!isAuroraHitted){
JOptionPane.showMessageDialog(null,"Ты нанёс "+(int)current_damage+" урона,"
                                 + "\nПротивник нанёс тебе "+(int)monster_current_damage+" урона,"
                                 + "\nИз них ты заблокировал " + (int)monster_blocked_damage+" урона"
                                 + "\nА противник "+(int)blocked_damage+" урона"
                                 + "\nТеперь у него "+(int)monster_hp+" жизни,"
                                 + "\nУ тебя "+(int)hp+" жизни.");
    }else{
    JOptionPane.showMessageDialog(null,"Гоблин атакует твою союзницу!"
                                 + "\nТы запоздало бьёшь его, и наносишь "+(int)current_damage+" урона,"
                                 + "\nНо он уже нанёс Авроре "+(int)monster_current_damage+" урона,"
                                 + "\nИз них она отразила магическим полем " + (int)monster_blocked_damage+" урона"
                                 + "\nНо и противник защитился на "+(int)blocked_damage + " единиц урона"
                                 + "\nТеперь у него "+(int)monster_hp+" жизни,"
                                 + "\nУ тебя "+(int)hp+" жизни,"
                                 + "\nА у Авроры " +(int)friend_hp+".");
    }
if(friend_hp<=0){
JOptionPane.showMessageDialog(null,"Хрупкая Аврора Чиаро падает, пронзённая клинком гоблина."
                                 + "\nО чёрт.. Этого не должно было случится, "
                                 + "\nПопробуешь ещё раз?");
hp=100;
friend_hp=70;
goblinsLeft=10;
}
if(hp>0){
JOptionPane.showMessageDialog(null,"Этот гоблин мёртв! Осталось ещё "+(goblinsLeft)+"!");
}else{
    if(rand.nextBoolean()){
JOptionPane.showMessageDialog(null,"Чёрный кривой клинок гоблина пробил твою броню."
                                 + "\nМир погружается во тьму..."
                                 + "\nНет, нет! Этого не должно было случиться!"
                                 + "\n"+name+", не сдавайся! Ещё раз!");}
    else{
JOptionPane.showMessageDialog(null,"Ты пропустил удар, и чёрное лезвие обезглавливает"
                                 + "\nтебя. Последнее, что ты слышишь - крик Авроры."
                                 + "\nО Солнце и Звёзды.. "
                                 + "\nПопробуй ещё раз, ладно?");
}
    if(goblinsLeft<=0){
    JOptionPane.showMessageDialog(null, "Победа!");
    isWin=true;
    }
    }
}
        }
    }
}



