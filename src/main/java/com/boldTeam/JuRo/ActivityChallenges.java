package com.boldTeam.JuRo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ActivityChallenges extends Activity {

    RecyclerView recyclerView;
    ArrayList<Challenge> challenges;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenges);

        challenges = new ArrayList<>();
        Challenge challenge = new Challenge();
        challenge.id = 1;
        challenge.tourId = 1;
        challenge.address = "پارک ملت ، میدان آزادی";
        challenge.name = "پارک ملت";
        switch (getSharedPreferences(getString(R.string.sharedP), MODE_PRIVATE).getInt("s1", 0)) {
            case 0:
                challenge.state = "امتیاز این چالش دریافت نشده است";
                break;
            case 1:
                challenge.state = "امتیاز این چالش دریافت شده است";
                break;
            case 2:
                challenge.state = "امتیاز این چالش دریافت نشده است";
                break;
        }
        challenge.info = "پارک ملت مشهد با مساحتی بالغ بر720 هزار متر مربع, بزرگترین پارک مشهد محسوب می شود.\n" +
                "\n" +
                "این پارک قدیمی ترین پارک مشهد می باشد که در سال 1343 به دستور محمدرضا پهلوی و توسط دو مهندس طراح انگلیسی احداث شد که بعد ها طرح آن توسط مهندسین ایرانی به اتمام رسید.\n" +
                "\n" +
                "درختان بی شمار ان پارک قدمت چند ده ساله دارند و انبوه و فراوانی این درخت ها هوای تازه ای را به ارمغان می آورد که آلودگی ناشی از شلوغی شهر در آن محو می شود.اگر شما صبح زود به این بوستان زیبا بروید طبیعت دوستان و ورزشکاران زیادی را می بینید که در تمام نقاط پارک در حال پیاده روی یا دویدن هستند.وجود دریاچه ای زیبا در مرکز پارک باعث مطبوع شدن و خنکی هوای آنجا شده است.\n" +
                "\n" +
                "این پارک بزرگ و زیبا شامل قسمت های مختلفی است که بزرگ ترین و اصلی ترین قسمت آن شهربازی یزرگ پارک ملت می باشد که اولین و بزرگ ترین شهربازی مشهد محسوب می شود.این شهر بازی در سال 1351 احداث شد و با گذر زمان تغییرات چشمگیری داشته است که مهم ترین آن تعویض چرخ و فلک آن است که اکنون این چرخ و فلک بزرگ ترین چرخ و فلک در خاورمیانه و هجدهمین چرخ و فلک مرتفع در دنیا می باشد.\n" +
                "\n" +
                "دیگر بخش های پارک شامل یزرگ ترین استخر روباز مشهد,زمین چمن فوتبال،والیبال,بسکتبال,تنیس,پیست اسکی و.. می باشدو\n" +
                "\n" +
                "در این پارک بزرگ, قسمت سرپوشیده ای از بوستان که باغ رز نام دارد به بانوان اختصاص یافته است که دارای اکانات و تجهیزات ورزشی می باشد.\n" +
                "\n" +
                "قسمت فرهنگی بوستان شامل کتابخانه،مسجد و کلاس های فرهنگی و هنری می باشد و نکته ی قابل توجه این جاست که بزرگترین سالن تئاتر مشهد در این پارک قرار دارد و بیشتر تئاتر های معروف و اصلی شهر در این پارک اجرا می شود.\n" +
                "\n" +
                "این پارک در غرب شهر مشهد و در حاشه ی بلوار وکیل آباد قرار دارد. زائران و گردشگران عزیز از طریق متروی مشهد به راحتی می توانند از این پارک زیبا دیدن کنند.";
        challenge.score = 50;
        switch (getSharedPreferences(getString(R.string.sharedP), MODE_PRIVATE).getInt("s2", 0)) {
            case 0:
                challenge.state = "امتیاز این چالش دریافت نشده است";
                break;
            case 1:
                challenge.state = "امتیاز این چالش دریافت شده است";
                break;
            case 2:
                challenge.state = "امتیاز این چالش دریافت نشده است";
                break;
        }
        challenge.image = BitmapFactory.decodeResource(getResources(), R.drawable.park_melat);
        challenge.barcode = BitmapFactory.decodeResource(getResources(), R.drawable.splash_logo);
        challenges.add(challenge);

        challenge = new Challenge();
        challenge.id = 2;
        challenge.tourId = 1;
        challenge.address = "آبشار اخلمد ، کیلومتر 84 جاده مشهد قوچان";
        challenge.name = "آبشار اخلمد";
        challenge.info = "\u200C\u200Cآبشار اخلمد نام آبشاری است که در استان خراسان رضوی در شمال شرقی ایران ودر شهرستان چناران میباشد. اخلمد که از گردشگاههای طبیعی اطراف مشهد می باشد و قدمتی چند هزار ساله دارد، در دره ای در میان کوه بینالود واقع شده است که در ابتدای دره ، انواع گل\u200Cها و گیاهان زیبا و درختان انبوه به همراه باغات فراوان میوه به چشم می\u200Cخورد و پس از طی مسیری آبشار اول که دارای 23 متر ارتفاع است، مشاهده میشود و با گذر از میان این آبشار و در یک کیلومتری آن، آبشار اصلی اخلمد با ارتفاعی حدودا 40 متری مشاهده می شود و آبشار سوم و چهارم نیز در بالای این آبشارها قرار دارد. ده اخلمد دارای باغ\u200Cهای زیبا و پرمحصولی می\u200Cباشد و از میان محصولات این منطقه سیب و گلابی اخلمد بسیار معروف است. اخلمد در 84 کیلومتری مشهد و در امتداد جاده مشهد- قوچان واقع شده است.";
        challenge.score = 50;
        switch (getSharedPreferences(getString(R.string.sharedP), MODE_PRIVATE).getInt("s1", 0)) {
            case 0:
                challenge.state = "امتیاز این چالش دریافت نشده است";
                break;
            case 1:
                challenge.state = "امتیاز این چالش دریافت شده است";
                break;
            case 2:
                challenge.state = "امتیاز این چالش دریافت نشده است";
                break;
        }
        challenge.image = BitmapFactory.decodeResource(getResources(), R.drawable.akhlamad);
        challenge.barcode = BitmapFactory.decodeResource(getResources(), R.drawable.splash_logo);
        challenges.add(challenge);

        challenge = new Challenge();
        challenge.id = 1;
        challenge.tourId = 3;
        challenge.address = "روستای ازغد ، بیست و پنج کیلومتری غرب مشهد";
        challenge.name = "روستای ازغد";
        challenge.info = "در بیست و پنج کیلومتری غرب مشهد روستای ییلاقی ای قرار دارد که با قدم گذاشتن در کوچه پس کوچه های آن گویا به دل تاریخ سفر کرده ایم. تاریخی که با صدای پیچش باد در لابلای سنگ ها و چهره زیبای خانه های سنگچین شده، دست در دست هم داده تا مهمان های خوانده و ناخوانده را به وجد بیاورند و آرامشی وصف ناشدنی را در بدو ورود به آنها هدیه دهد؛ اینجا ازغد است روستایی که بوی صبح دل انگیزش با آواز پرندگان در هم می آمیزد و طبیعت بکرش چونان گهواره ایست که هنگام استراحت در دل آن گویی به خوابی شیرین رفته ایم.\n\nمردمان ازغد به آن زقی می گویند. نام این روستا در گذشته به صورت ازقد نوشته می شده و مخفف “از قدیم” به معنی باقی مانده از گذشته و قدیم بوده است.\n\nبرای رسیدن به این روستا باید از مسیر جاده مشهد به طرقبه راهی شوید، اواسط راه که رسیدید در سمت چپ جاده، مسیری وجود دارد که به خیابان امامزادگان ناصر و یاسر معروف است اگر این جاده را پیش بگیرید و روستای حصار گلستان را پشت سر بگذارید با رسیدن به دوراهی بین روستای ازغد و مایان راه سمت راست را پیش گرفته و پس از سپری کردن حدود ۱۲ کیلومتر به روستای تاریخی ازغد خواهید رسید. تمام جاده آسفالت می باشد و در کنار راه درخت های توت منظره ای زیبا به این مسیر بخشیده اند.";
        challenge.score = 50;
        switch (getSharedPreferences(getString(R.string.sharedP), MODE_PRIVATE).getInt("s2", 0)) {
            case 0:
                challenge.state = "امتیاز این چالش دریافت نشده است";
                break;
            case 1:
                challenge.state = "امتیاز این چالش دریافت شده است";
                break;
            case 2:
                challenge.state = "امتیاز این چالش دریافت نشده است";
                break;
        }
        challenge.image = BitmapFactory.decodeResource(getResources(), R.drawable.azghd);
        challenge.barcode = BitmapFactory.decodeResource(getResources(), R.drawable.splash_logo);
        challenges.add(challenge);

        challenge = new Challenge();
        challenge.id = 4;
        challenge.tourId = 1;
        switch (getSharedPreferences(getString(R.string.sharedP), MODE_PRIVATE).getInt("s3", 0)) {
            case 0:
                challenge.state = "امتیاز این چالش دریافت نشده است";
                break;
            case 1:
                challenge.state = "امتیاز این چالش دریافت شده است";
                break;
            case 2:
                challenge.state = "امتیاز این چالش دریافت نشده است";
                break;
        }
        challenge.address = "آبشار بار نیشابور ، 46 کیلومتری شهرستان نیشابور";
        challenge.name = "آبشار بار نیشابور";
        challenge.info = "یکی از دیدنی ترین آبشارهای منطقه ی نیشابور آبشار بار نیشابور است . این منطقه به علت وجود پوشش گیاهی گوناگون، نظر گردشگران زیادی را به خود جلب نموده است. جالب است بدانید که آبشار بار به صورت پلکانی بوده و ارتفاع آن در یک مکان قابل مشاهده نیست.\n" +
                "همچنین دره باز و وجود باغات پهناور، که دارای چشم انداز های بسیار زیباییست، به سرسبزی منطقه و آب و هوای آن کمک بسیاری کرده است. طبیعت پرطراوت و سرسبز اطراف آبشار بهمراه موسیقی ریزش آب، فضای دلپذیری بوجود آورده و در فصول مساعد سال، علاقه مندان بسیاری را جذب می کند.\n" +
                "روستای بار دارای ارتفاع 1670متری از سطح دریا است و دارای آب و هوای معتدل و کوهستانی است به صورتی که زمستان\u200Cهای سرد و تابستان\u200Cهای معتدلی دارد. ارتفاعات بینالود در این بخش به آهک\u200Cهای کارستی تبدیل می\u200Cشود که همچون یک اسفنج آب را به درون خود می کشند و آن را به آرامی برمی گرداند. در این قسمت، آب از میانه کوه بیرون می جهد و آبشاری با طول 300متر را به بوجود می آورد که در دامان کوه رها و یک منظره جنگلی بوجود می آورد.";
        challenge.score = 50;
        challenge.image = BitmapFactory.decodeResource(getResources(), R.drawable.bar_nishabur);
        challenge.barcode = BitmapFactory.decodeResource(getResources(), R.drawable.splash_logo);
        challenges.add(challenge);
        findViews();

        initRv();
    }

    private void initRv() {
        AdapterChallenge adapter = new AdapterChallenge(challenges,getSharedPreferences(getString(R.string.sharedP),MODE_PRIVATE).edit(),this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

    private void findViews() {
        recyclerView = findViewById(R.id.AChallenges_rv);
    }

    @Override
    public void onBackPressed() {
        Intent intent=new Intent(this, ActivityChallenge.class);
        intent.putExtra("tourId",1);
        startActivity(intent);
        overridePendingTransition(R.anim.alpha_in,R.anim.alpha_out);
        finish();
    }
}
