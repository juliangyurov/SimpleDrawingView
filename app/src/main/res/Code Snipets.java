// Spline packet 1
for (int i = 0;i<400;i++){
        drawPaint.setColor(Color.rgb(i*3,i*7,i*11));
        canvas.drawLine(150+i,150+i/2,500+i/2,350+i,drawPaint);
        }

// Spline packet 2
for (int i = 0;i<400;i++){
        drawPaint.setColor(Color.rgb(i*3,i*7,i*11));
        canvas.drawLine(150+i,150+i/2,500+i,350+i,drawPaint);
        }

// Spline packet 3
for (int i = 0;i<200;i++){
        drawPaint.setColor(Color.rgb(i*3,i*7,i*11));
        canvas.drawLine(150+i,150+i/2,500+i,350+i,drawPaint);
        }

// Spline packet 4
for (int i = 0;i<200;i++){
        drawPaint.setColor(Color.rgb(i*3,i*7,i*11));
        canvas.drawLine(150+i,150+i/2,500+(float)Math.sqrt(i),350+i,drawPaint);
        }

// Spline packet 5
for (int i = 0;i<600;i++){
        drawPaint.setColor(Color.rgb(i*3,i*7,i*11));
        canvas.drawLine(150+i,150+i/2,500+(float)Math.sqrt(i),350+i,drawPaint);
        }

// Spline packet 6
for (int i = 0;i<700;i++){
        drawPaint.setColor(Color.rgb(i*3,i*7,i*11));
        canvas.drawLine(150+i,150+(float)Math.sqrt(i),500+(float)Math.sqrt(i),350+i,drawPaint);
        }

// Spline packet 7
        int i = 0;

        for (int b = 0; b < 256; b+=10) {
        for (int g = 0; g < 256; g+=10) {
        for (int r = 0; r < 256; r+=10) {

        drawPaint.setColor(Color.rgb(r, g, b));
        canvas.drawLine(150 + i, 150 + i / 3, 500 + (float) Math.sqrt(i), 350 + i, drawPaint);
        i++;
        if (i>770) break;
        }
        if (i>770) break;
        }
        if (i>770) break;
        }

// Spline packet 8
        int r,g,b;
        r=g=b=0;
        boolean ir,ig,ib;
        ir=ig=ib=true;

        for (int i = 0;i<700;i++){

        if(ir) {
        r+=3;
        if(r>256){
        ir=!ir;
        }
        }else{
        r-=3;
        if (r<0){
        ir=!ir;
        }
        }

        if(ig) {
        g+=5;
        if(g>256){
        ig=!ig;
        }
        }else{
        g-=5;
        if (g<0){
        ig=!ig;
        }
        }

        if(ib) {
        b+=7;
        if(b>256){
        ib=!ib;
        }
        }else{
        b-=7;
        if (b<0){
        ib=!ib;
        }
        }

        drawPaint.setColor(Color.rgb(r,g,b));
        canvas.drawLine(150+i,150+(float)Math.sqrt(i),500+(float)Math.sqrt(i),350+i,drawPaint);
        }

//Spline packet
        int r,g,b;
        r=g=b=0;
        boolean ir,ig,ib;
        ir=ig=ib=true;

        for (int i = 0;i<700;i++){

        if(ir) {
        r+=3;
        if(r>256){
        ir=!ir;
        }
        }else{
        r-=3;
        if (r<0){
        ir=!ir;
        }
        }

        if(ig) {
        g+=5;
        if(g>256){
        ig=!ig;
        }
        }else{
        g-=5;
        if (g<0){
        ig=!ig;
        }
        }

        if(ib) {
        b+=7;
        if(b>256){
        ib=!ib;
        }
        }else{
        b-=7;
        if (b<0){
        ib=!ib;
        }
        }

        drawPaint.setColor(Color.rgb(r,g,b));
        //canvas.drawLine(150+i,150+(float)Math.sqrt(i),500+(float)Math.sqrt(i),350+i,drawPaint);
        canvas.drawLine(150+i,150+i,500+(float)Math.sqrt(i),350+i,drawPaint);
        }

// Spline packet - very good colors
        int r,g,b;
        r=g=b=0;
        boolean ir,ig,ib;
        ir=ig=ib=true;

        for (int i = 0;i<700;i++){

        if(ir) {
        r+=1;
        if(r>254){
        ir=!ir;
        }
        }else{
        r-=1;
        if (r<1){
        ir=!ir;
        }
        }

        if(ig) {
        g+=3;
        if(g>252){
        ig=!ig;
        }
        }else{
        g-=3;
        if (g<3){
        ig=!ig;
        }
        }

        if(ib) {
        b+=5;
        if(b>250){
        ib=!ib;
        }
        }else{
        b-=5;
        if (b<5){
        ib=!ib;
        }
        }

        drawPaint.setColor(Color.rgb(r,g,b));
        canvas.drawLine(150+i,150+(float)Math.sqrt(i),500+(float)Math.sqrt(i),350+i,drawPaint);
        //canvas.drawLine(150,150+i,750,150+i,drawPaint);
        }

//Spline packet crossing plain - very good
        int r,g,b;
        r=g=b=0;
        boolean ir,ig,ib;
        ir=ig=ib=true;

        for (int i = 0;i<700;i++){

        if(ir) {
        r+=1;
        if(r>254){
        ir=!ir;
        }
        }else{
        r-=1;
        if (r<1){
        ir=!ir;
        }
        }



        if(ig) {
        g+=3;
        if(g>252){
        ig=!ig;
        }
        }else{
        g-=3;
        if (g<3){
        ig=!ig;
        }
        }



        if(ib) {
        b+=5;
        if(b>250){
        ib=!ib;
        }
        }else{
        b-=5;
        if (b<5){
        ib=!ib;
        }
        }

        b=40;

        drawPaint.setColor(Color.rgb(r,g,b));
        canvas.drawLine(150,150+i,750,150+i,drawPaint);
        canvas.drawLine(150+i,150+(float)Math.sqrt(i),500+(float)Math.sqrt(i),350+i,drawPaint);
        //canvas.drawLine(150,150+i,750,150+i,drawPaint);
        }

//Spline packet crossing plain - color steps added
        //color elements r g b
        int r,g,b;
        r=g=b=0;
        //incrementing or decrementing colors r g b
        boolean ir,ig,ib;
        ir=ig=ib=true;
        //color steps r g b
        int sr,sg,sb;
        //sr=sg=sb=5;
        sr=5;sg=7;sb=11;

        for (int i = 0;i<700;i++){

        if(ir) {
        r+=sr;
        if(r>255-sr){
        ir=!ir;
        }
        }else{
        r-=sr;
        if (r<sr){
        ir=!ir;
        }
        }

        //r=40;

        if(ig) {
        g+=sg;
        if(g>255-sg){
        ig=!ig;
        }
        }else{
        g-=sg;
        if (g<sg){
        ig=!ig;
        }
        }

        //g=40;

        if(ib) {
        b+=sb;
        if(b>255-sb){
        ib=!ib;
        }
        }else{
        b-=sb;
        if (b<sb){
        ib=!ib;
        }
        }

        //b=40;

        drawPaint.setColor(Color.rgb(r,g,b));
        canvas.drawLine(150,150+i,750,150+i,drawPaint);
        canvas.drawLine(150+i,150+(float)Math.sqrt(i),500+(float)Math.sqrt(i),350+i,drawPaint);
        //canvas.drawLine(150,150+i,750,150+i,drawPaint);
        }

//Double spiral - DNA molecule model
        //color elements r g b
        int r,g,b;
        r=g=b=0;
        //incrementing or decrementing colors r g b
        boolean ir,ig,ib;
        ir=ig=ib=true;
        //color steps r g b
        int sr,sg,sb;
        //sr=sg=sb=5;
        sr=1;sg=31;sb=17;

        for (int i = 0;i<700;i++){

        if(ir) {
        r+=sr;
        if(r>255-sr){
        ir=!ir;
        }
        }else{
        r-=sr;
        if (r<sr){
        ir=!ir;
        }
        }

        //r=40;

        if(ig) {
        g+=sg;
        if(g>255-sg){
        ig=!ig;
        }
        }else{
        g-=sg;
        if (g<sg){
        ig=!ig;
        }
        }

        //g=40;

        if(ib) {
        b+=sb;
        if(b>255-sb){
        ib=!ib;
        }
        }else{
        b-=sb;
        if (b<sb){
        ib=!ib;
        }
        }

        //b=40;

        drawPaint.setColor(Color.rgb(r,g,b));

        //canvas.drawLine(150+i,150,150+i,750,drawPaint);

        //canvas.drawLine(150,150+i,750,150+i,drawPaint);

        //canvas.drawLine(150+i,150+(float)Math.sqrt(i),500+(float)Math.sqrt(i),350+i,drawPaint);

        canvas.drawLine(150+i,150+i,500+(float)Math.sqrt(i),350+i,drawPaint);

        }

//Donuts

        //color elements r g b
        int r,g,b;
        r=g=b=0;
        //incrementing or decrementing colors r g b
        boolean ir,ig,ib;
        ir=ig=ib=true;
        //color steps r g b
        int sr,sg,sb;
        //sr=sg=sb=5;
        sr=1;sg=3;sb=61;

        for (int i = 0;i<700;i++){

        if(ir) {
        r+=sr;
        if(r>255-sr){
        ir=!ir;
        }
        }else{
        r-=sr;
        if (r<sr){
        ir=!ir;
        }
        }

        //r=40;

        if(ig) {
        g+=sg;
        if(g>255-sg){
        ig=!ig;
        }
        }else{
        g-=sg;
        if (g<sg){
        ig=!ig;
        }
        }

        //g=40;

        if(ib) {
        b+=sb;
        if(b>255-sb){
        ib=!ib;
        }
        }else{
        b-=sb;
        if (b<sb){
        ib=!ib;
        }
        }

        //b=40;

        drawPaint.setColor(Color.rgb(r,g,b));

        //canvas.drawLine(150+i,150,150+i,750,drawPaint);

        //canvas.drawLine(150,150+i,750,150+i,drawPaint);

        //canvas.drawLine(150+i,150+(float)Math.sqrt(i),500+(float)Math.sqrt(i),350+i,drawPaint);

        //canvas.drawLine(150+i,150+i,500+(float)Math.sqrt(i),350+i,drawPaint);

        canvas.drawCircle(400,500,i,drawPaint);

        }