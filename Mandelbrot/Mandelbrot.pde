// Daniel Shiffman
// http://codingtra.in
// http://patreon.com/codingtrain
// Code for: https://youtu.be/6z7GQewK-Ks

float angle;

void setup() {
  size(740, 680);
  colorMode(HSB, 1);
}
void draw() {
  float ca = map(mouseX, 0, width, -2, 2);//-0.8 ;
  float cb = map(mouseY, 0, height, -2, 2); //0.156 ;
  
  //float ca = cos(angle * 0.3938);
  //float cb = sin(angle);
  //angle += 0.01;
  
  background(255);

  // Establish a range of values on the complex plane
  // A different range will allow us to "zoom" in or out on the fractal

  // It all starts with the width, try higher or lower values
  float w = 4;
  float h = (w * height) / width;
  //println(w);

  // Start at negative half the width and height
  float xmin = -w/2;
  float ymin = -h/2;

  // Make sure we can write to the pixels[] array.
  // Only need to do this once since we don't do any other drawing.
  loadPixels();

  // Maximum number of iterations for each point on the complex plane
  int maxiterations = 100;

  // x goes from xmin to xmax
  float xmax = xmin + w;
  // y goes from ymin to ymax
  float ymax = ymin + h;

  // Calculate amount we increment x,y for each pixel
  float dx = (xmax - xmin) / (width);
  float dy = (ymax - ymin) / (height);

  // Start y
  float y = ymin;
  for (int j = 0; j < height; j++) {
    // Start x
    float x = xmin;
    for (int i = 0; i < width; i++) {

      // Now we test, as we iterate z = z^2 + cm does z tend towards infinity?
      float a = x;
      float b = y;
      int n = 0;
      while (n < maxiterations) {
        float aa = a * a;
        float bb = b * b;
        if (a*a + b*b > 4.0) {
          break;  // Bail
        }
        float twoab = 2.0 * a * b;
        
        // change the number of x and y ( real and imaginary number) will change
        // into many shape or form
        // origine code 
        a = aa - bb + ca ;
        b = twoab + cb ;
        
        // example
        //a = aa - bb -0.8 ;
        //b = twoab + 0.156 ;
      
       // Infinty in our finite world is simple, let's just consider it 16
       
        n++;
      }

      // We color each pixel based on how long it takes to get to infinity
      // If we never got there, let's pick the color black
      if (n == maxiterations) {
        pixels[i+j*width] = color(0);
      } else {
        // Gosh, we could make fancy colors here if we wanted
        float hu = sqrt(float(n) / maxiterations);
        pixels[i+j*width] = color(hu,255,255);
      }
      x += dx;
    }
    y += dy;
  }
  updatePixels();
  println(frameRate);
}
