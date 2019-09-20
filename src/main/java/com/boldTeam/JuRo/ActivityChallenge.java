package com.boldTeam.JuRo;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class ActivityChallenge extends Activity implements OnChangeFragment{

    int numPage = 0;
    Tour tour;
    Challenge challenge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge);

//        if (getIntent().getIntExtra("tourId",-1)==-1){
//            numPage=getSharedPreferences(getString(R.string.sharedP),MODE_PRIVATE).getInt(getString(R.string.current),-1);
//        }
        getChallenge();
    }

    private void getChallenge() {
        if (getIntent().getIntExtra("tourId",-1)==1) {
            tour=new Tour();
            tour.id=1;
            tour.score=500;
            tour.name="چالش مشهد گردی";
            tour.end="1399/02/01";
            tour.start="1398/02/01";
            tour.image= getRoundedCornerBitmap(R.drawable.mashhad);
            tour.info="توضیحات چالش گردشگری";
            tour.challenges=new ArrayList<>();
            Challenge challenge = new Challenge();
            challenge.id = 1;
            challenge.tourId=1;
            challenge.address="پارک ملت ، میدان آزادی";
            challenge.name="پارک ملت";
            challenge.info="پارک ملت مشهد با مساحتی بالغ بر720 هزار متر مربع, بزرگترین پارک مشهد محسوب می شود.\n" +
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
            challenge.score=50;
            challenge.image= BitmapFactory.decodeResource(getResources(),R.drawable.park_melat);
            challenge.barcode=BitmapFactory.decodeResource(getResources(),R.drawable.splash_logo);
            tour.challenges.add(challenge);

            challenge = new Challenge();
            challenge.id = 2;
            challenge.tourId=1;
            challenge.address="آبشار اخلمد ، کیلومتر 84 جاده مشهد قوچان";
            challenge.name="آبشار اخلمد";
            challenge.info="\u200C\u200Cآبشار اخلمد نام آبشاری است که در استان خراسان رضوی در شمال شرقی ایران ودر شهرستان چناران میباشد. اخلمد که از گردشگاههای طبیعی اطراف مشهد می باشد و قدمتی چند هزار ساله دارد، در دره ای در میان کوه بینالود واقع شده است که در ابتدای دره ، انواع گل\u200Cها و گیاهان زیبا و درختان انبوه به همراه باغات فراوان میوه به چشم می\u200Cخورد و پس از طی مسیری آبشار اول که دارای 23 متر ارتفاع است، مشاهده میشود و با گذر از میان این آبشار و در یک کیلومتری آن، آبشار اصلی اخلمد با ارتفاعی حدودا 40 متری مشاهده می شود و آبشار سوم و چهارم نیز در بالای این آبشارها قرار دارد. ده اخلمد دارای باغ\u200Cهای زیبا و پرمحصولی می\u200Cباشد و از میان محصولات این منطقه سیب و گلابی اخلمد بسیار معروف است. اخلمد در 84 کیلومتری مشهد و در امتداد جاده مشهد- قوچان واقع شده است.";
            challenge.score=50;
            challenge.image=BitmapFactory.decodeResource(getResources(),R.drawable.akhlamad);
            challenge.barcode=BitmapFactory.decodeResource(getResources(),R.drawable.splash_logo);;
            tour.challenges.add(challenge);

            challenge = new Challenge();
            challenge.id = 1;
            challenge.tourId=3;
            challenge.address="روستای ازغد ، بیست و پنج کیلومتری غرب مشهد";
            challenge.name="روستای ازغد";
            challenge.info="در بیست و پنج کیلومتری غرب مشهد روستای ییلاقی ای قرار دارد که با قدم گذاشتن در کوچه پس کوچه های آن گویا به دل تاریخ سفر کرده ایم. تاریخی که با صدای پیچش باد در لابلای سنگ ها و چهره زیبای خانه های سنگچین شده، دست در دست هم داده تا مهمان های خوانده و ناخوانده را به وجد بیاورند و آرامشی وصف ناشدنی را در بدو ورود به آنها هدیه دهد؛ اینجا ازغد است روستایی که بوی صبح دل انگیزش با آواز پرندگان در هم می آمیزد و طبیعت بکرش چونان گهواره ایست که هنگام استراحت در دل آن گویی به خوابی شیرین رفته ایم.\n\nمردمان ازغد به آن زقی می گویند. نام این روستا در گذشته به صورت ازقد نوشته می شده و مخفف “از قدیم” به معنی باقی مانده از گذشته و قدیم بوده است.\n\nبرای رسیدن به این روستا باید از مسیر جاده مشهد به طرقبه راهی شوید، اواسط راه که رسیدید در سمت چپ جاده، مسیری وجود دارد که به خیابان امامزادگان ناصر و یاسر معروف است اگر این جاده را پیش بگیرید و روستای حصار گلستان را پشت سر بگذارید با رسیدن به دوراهی بین روستای ازغد و مایان راه سمت راست را پیش گرفته و پس از سپری کردن حدود ۱۲ کیلومتر به روستای تاریخی ازغد خواهید رسید. تمام جاده آسفالت می باشد و در کنار راه درخت های توت منظره ای زیبا به این مسیر بخشیده اند.";
            challenge.score=50;
            challenge.image=BitmapFactory.decodeResource(getResources(),R.drawable.azghd);
            challenge.barcode=BitmapFactory.decodeResource(getResources(),R.drawable.splash_logo);;
            tour.challenges.add(challenge);

            challenge = new Challenge();
            challenge.id = 4;
            challenge.tourId=1;
            challenge.address="آبشار بار نیشابور ، 46 کیلومتری شهرستان نیشابور";
            challenge.name="آبشار بار نیشابور";
            challenge.info="یکی از دیدنی ترین آبشارهای منطقه ی نیشابور آبشار بار نیشابور است . این منطقه به علت وجود پوشش گیاهی گوناگون، نظر گردشگران زیادی را به خود جلب نموده است. جالب است بدانید که آبشار بار به صورت پلکانی بوده و ارتفاع آن در یک مکان قابل مشاهده نیست.\n" +
                    "همچنین دره باز و وجود باغات پهناور، که دارای چشم انداز های بسیار زیباییست، به سرسبزی منطقه و آب و هوای آن کمک بسیاری کرده است. طبیعت پرطراوت و سرسبز اطراف آبشار بهمراه موسیقی ریزش آب، فضای دلپذیری بوجود آورده و در فصول مساعد سال، علاقه مندان بسیاری را جذب می کند.\n" +
                    "روستای بار دارای ارتفاع 1670متری از سطح دریا است و دارای آب و هوای معتدل و کوهستانی است به صورتی که زمستان\u200Cهای سرد و تابستان\u200Cهای معتدلی دارد. ارتفاعات بینالود در این بخش به آهک\u200Cهای کارستی تبدیل می\u200Cشود که همچون یک اسفنج آب را به درون خود می کشند و آن را به آرامی برمی گرداند. در این قسمت، آب از میانه کوه بیرون می جهد و آبشاری با طول 300متر را به بوجود می آورد که در دامان کوه رها و یک منظره جنگلی بوجود می آورد.";
            challenge.score=50;
            challenge.image=BitmapFactory.decodeResource(getResources(),R.drawable.bar_nishabur);
            challenge.barcode=BitmapFactory.decodeResource(getResources(),R.drawable.splash_logo);
            tour.challenges.add(challenge);

        }
        setFrargments();
        Log.v("sdfsdfdds","sdfsd");
    }


    public Bitmap getRoundedCornerBitmap(int resource) {
        Bitmap input=BitmapFactory.decodeResource(getResources(),resource);
        int w=input.getWidth();
        int h=input.getHeight();
        Bitmap output = Bitmap.createBitmap(w,h, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(output);
        final float densityMultiplier = getResources().getDisplayMetrics().density;

        final int color = 0xff424242;
        final Paint paint = new Paint();
        final Rect rect = new Rect(0, 0, w, h);
        final RectF rectF = new RectF(rect);

//make sure that our rounded corner is scaled appropriately
        final float roundPx = 20*densityMultiplier;

        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(color);
        canvas.drawRoundRect(rectF, roundPx, roundPx, paint);


//draw rectangles over the corners we want to be square
//        if (squareTL ){
//            canvas.drawRect(w/2, h/2, w/2, h/2, paint);
//        }
//        if (squareTR ){
//            canvas.drawRect(w/2, 0, w, h/2, paint);
//        }
//        if (squareBL ){
//            canvas.drawRect(0, h/2, w/2, h, paint);
//        }
//        if (squareBR ){
//            canvas.drawRect(w/2, h/2, w, h, paint);
//        }
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(input, 0,0, paint);
//
//        Bitmap output = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
//        Canvas canvas = new Canvas(output);
//        final Paint paint = new Paint();
//        final Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
//        final RectF rectF = new RectF(rect);
//        final float roundPx = 10 * getResources().getDisplayMetrics().density;
//        paint.setAntiAlias(true);
//        canvas.drawRoundRect(rectF,roundPx,roundPx, paint);
//        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
//        canvas.drawBitmap(bitmap, rect, rect, paint);
        return output;
    }

    private void setFrargments() {
        FragmentTransaction ft=getFragmentManager().beginTransaction();
        switch (numPage) {
            case 0:
                ft.replace(R.id.AChallenges_frame,new FragmentTour(tour,this));
                ft.commit();
//                Log.v("sdfsdfdds","sdfsd");
//                ft.replace(R.id.AChallenges_frame,new FragmentChallenges(this,challenges,getIntent().getIntExtra("tourType",1)));
//                ft.commit();
                break;
            case 1:
                ft.replace(R.id.AChallenges_frame,new FragmentInfoChaleleng(challenge,this));
                ft.commit();
//                ft.replace(R.id.AChallenges_frame,new FragmentChallenges(this,challenges,getIntent().getIntExtra("tourType",1)));
//                ft.commit();
//                getSharedPreferences(getString(R.string.sharedP),MODE_PRIVATE).edit().putInt(getString(R.string.current),selectedChallenge.id).commit();
//                startActivity(new Intent(this,UnityPlayerActivity.class));
//                finish();

                break;
        }
    }

    @Override
    public void onBackPressed() {
        if (numPage==0) {
            startActivity(new Intent(this, ActivityMain.class));
            overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
            finish();
        }else{
            numPage=0;
            setFrargments();
        }
    }

    @Override
    public void changeChallenge(int state, Challenge challenge) {
        if (state==-1){
            numPage=0;
            onBackPressed();
        }else if (state==0){
            numPage=0;
//            this.selectedChallenge=challenge;
            setFrargments();
        }else{
            numPage=1;
            this.challenge=challenge;
            setFrargments();
        }
    }
}
