package com.example.goldenteamproject.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.goldenteamproject.R;

public class DescriptionSheet extends AppCompatActivity {
    ImageView HeaderImage;
    TextView title, recipe;
    String value;
    int headerImage;
    String theNameOfRecipe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_sheet);

        HeaderImage = findViewById(R.id.HeaderPhotoSheet);
        title = findViewById(R.id.header_title);
        recipe = findViewById(R.id.recipeOfsheet);
        //
        // العنوان الي جاي من الrecycell view
         Bundle extras = getIntent().getExtras();
               if (extras!=null){
                   theNameOfRecipe = extras.getString("HeaderTitle");
                   headerImage = extras.getInt("HeaderImage");
               }
        title.setText(theNameOfRecipe.toString());
        ////////و الصوره كذلك
           HeaderImage.setImageResource(headerImage);
        ////////////////////
        if (theNameOfRecipe != null &&  theNameOfRecipe.equalsIgnoreCase("Corn Chowder")){
            recipe.setText("Soup's on! Even if you think you have nothing to make for dinner, you probably have all the ingredients you need to prepare a comforting pot of healthy turkey and corn chowder. It's chock full of carrots, potatoes, and corn for a filling and tasty meal Turkey Corn Chowder – One pot and 30 minutes is all you will need to make this delicious and hearty, quick cooking chowder loaded with turkey, potatoes, and corn." +
                    "Obvi, I’m already thinking about YOU and your turkey leftovers. You are SO very welcome!\n" +
                    "HALLO HALLO! How are you? What are you doing? Having a great Sunday, I hope! I’m skipping Church – the snow is above my knees and my driveway is waiting for its owner to clean it up. Yes, that would be me, but The Breakfast Club is on TV and I ain’t movin’.\n" +
                    "So I know we have this thing in like, six, seven days… the day where we eat a ton of food and then we end up in a food coma for a week, but the thing is? I can’t stop thinking about the leftovers! I honestly LOVE Thanksgiving Leftovers! \n" +
                    "LEFTOVER TURKEY CORN CHOWDER\n" +
                    "I know you’re busy making lists and running to the grocery store and figuring out just where to store that giant Butterball – I am partial to this Bacon Spatchcock Turkey (TRY IT \uD83D\uDE0B) – and maybe doing things like making an apple pie, a pumpkin pie, and a pecan pie for your family, or maybe just for yourself!\n" +
                    "BUT I’m confident that you are also thinking about those turkey leftovers and need all the help you can get.\n" +
                    "I mean, maybe you aren’t thinking about that, but we sort of have this mutual relationship of sorts and because of that, I don’t know, I feel like we get each other? You and I. It’s like ESP for food.\n" +
                    "NO? It’s just me!? I’m the only one thinking about leftovers?? meh.\n" +
                    "Regardless, in due time, I know you will thank me. Like, on Friday. Just watch.\n" +
                    "Sidenote: Don’t you hate it/love it when people say irregardless? I cringe. \uD83D\uDE2C \n" +
                    "Oh and guess what? I’m such a hypocrite. I generally do not like canned cream style corn. Nope siree bob. But, it makes a lot of sense here, in this corn chowder recipe.\n" +
                    "It makes sense in the way that I don’t want you to spend too much time in the kitchen on Friday because, you’ll be too busy nursing that food hangover, you know? Therefore, to save us all some time, we’re going to reach for the creamy corn.\n" +
                    "TURKEY CORN CHOWDER\n" +
                    "Also? This Turkey Corn Chowder is basically a dump and cook soup. As in, you just dump it all in the pot and let it go to town for around 30 minutes. Easy, right? Told you! A thick and hearty chowder that comes together in a matter of minutes? HECK YEAH!\n" +
                    "One other awesome factor? You don’t have to make it with just turkey! You can also use some leftover chicken, baked ham, shrimp! Whatever floats that soup boat.\n" +
                    "If this isn’t your thing, I highly suggest some Turkey Tetrazzini with Fetuccine or this Leftover Turkey Frittata. Which can also be breakfast. Or lunch. Or everything in between because, it is SO GOOD!\n" +
                    "Uh, yeah. Do it.\n" +
                            "ENJOY!" +
                            "\n"+
                            " "+
                            "\n"+
                            " "+
                            "ahmed nagah"



                    );

        }
        if (theNameOfRecipe != null &&  theNameOfRecipe.equalsIgnoreCase("Peanut Butter Oatmeal Bars")){
            recipe.setText("" +
                    "These peanut butter oatmeal bars are the best trick! They’re no bake, easy and healthy; and the flavor is out of this world." +
                    "Ingredients\n" +
                    "    • 1 cup creamy peanut butter (no sugar added, or sunflower butter for nut free)\n" +
                    "    • ½ cup honey (or ½ cup agave syrup* for vegan)\n" +
                    "    • 4 cups Old Fashioned rolled oats\n" +
                    "    • ½ teaspoon kosher salt\n" +
                    "    • ½ teaspoon cinnamon\n" +
                    "    • 1 to 2 ounces dark chocolate (1/8 to 1/4 cup chocolate chips)" +
                    "Instructions\n" +
                    "    1. Mix together the peanut butter, honey, oats, salt and cinnamon in a bowl. (If the mixture seems dry and not sticky, add a bit more peanut butter and/ or honey; different peanut butter brands perform differently.)\n" +
                    "    2. Add a sheet of parchment paper to a 9 x 9 pan. Place the ingredients in the pan and press it into an even layer. Use a small glass to roll over the top to get it smooth. \n" +
                    "    3. Freeze the bars for 10 minutes. Remove the pan from the freezer and use the parchment to lift it out of the pan. Cut into 20 rectangles (4 x 5 rows) or 40 small rectangles.\n" +
                    "    4. In the microwave with short intervals or over a double boiler, melt the chocolate, stirring until it comes together into a glossy chocolate. If using the microwave, use short bursts of 10 seconds or so and stir after each: be careful not to overheat the chocolate or get any water in the chocolate, which will cause it to seize up. When melted, drizzle over the bars and allow to cool.  You can eat right away, or refrigerate for about 1 hour for a more solid texture. Store refrigerated for up to 2 weeks (or frozen for several months, placing wax paper between the layers). \n" +
                    "Notes\n" +
                    "*Maple syrup is generally our sweetener of choice, but the flavor and texture of honey really make these bars. Since maple syrup is not as sticky as honey, for vegan substitute we recommend agave syrup. \n" +
                    "**We typically use about 1 ounce for a very light drizzle, but you can use more if you’d like more chocolate. " +
                    "");
        }
                if (theNameOfRecipe != null &&  theNameOfRecipe.equalsIgnoreCase("Herb-Crusted Salmon")){

                    recipe.setText("Flaky salmon slathered in creamy dijon mustard then topped with crispy panko and fresh herbs." +
                            "INGREDIENTS\n" +
                            "    • 2 large wild Alaskan salmon fillets  skin removed, fresh or frozen\n" +
                            "    • 1/4 cup dijon mustard\n" +
                            "    • 1/2-2/3 cup plain panko breadcrumbs\n" +
                            "    • 1 TBSP fresh chopped parsley\n" +
                            "    • 1 TBSP fresh chopped chives\n" +
                            "    • 1/4 tsp garlic powder\n" +
                            "    • 1/4 tsp paprika\n" +
                            "    • 1/8 tsp dried dill or 1/2 TBSP fresh\n" +
                            "    • 2-3 TBSP olive oil\n" +
                            "    • sea salt to taste\n" +
                            "INSTRUCTIONS\n" +
                            "    • Defrost if using frozen.\n" +
                            "    • Preheat your oven or toaster oven to 450 degrees F.\n" +
                            "    • On a plate, combine panko with parsley, chives, garlic powder, paprika, and dill and season with salt, to taste.\n" +
                            "    • Using a butter knife, spread an even layer of dijon mustard on each side of the salmon, using extra if needed.\n" +
                            "    • Dredge the salmon in the panko mixture, pressing the herbed breading firmly into the fish to coat on both sides.\n" +
                            "    • Heat a pan or skillet with a few spoonfuls of olive oil.\n" +
                            "    • Once your pan is hot, add the salmon and cook on both sides for approx 2-3 minutes each. Try to be gentle, the panko will start to abandon ship if you manhandle the fish too much in the pan. You can add a little more of the breading/herb mixture while cooking if that happens, no worries! Look for a peachy pink/opaque outer layer on each side with a rare center and a golden panko crust.\n" +
                            "    • With a spatula, gently move the salmon to a foil lined baking sheet and bake for approximately 5-10 minutes, depending on the thickness of your fillets, until the center is fully cooked and opaque.\n" +
                            "    • If you’re using a cast-iron or oven-safe skillet, pop that bad boy with the fish directly in the oven.\n" +
                            "    • The result is a crisp, flavorful crust on the outside with a tender flaky inside.\n" +
                            "    • Serve with fresh lemon wedges and garnish with an extra sprinkle of herbs!\n" +
                            "NOTES\n" +
                            "Serve with lemon wedges for a burst of citrus.\n" +
                            "Nutrition Facts below are estimated using an online recipe nutrition calculator. Adjust as needed based on size/weight of salmon used and enjoy!\n" +
                            "NUTRITION\n" +
                            "Calories: 208kcal, Carbohydrates: 13g, Protein: 3g, Fat: 16g, Saturated Fat: 1g, Sodium: 465mg, Potassium: 72mg, Fiber: 1g, Sugar: 1g, Vitamin A: 356IU, Vitamin C: 4mg, Calcium: 45mg, Iron: 1mg\n" +
                            "" +
                            "" +
                            "" +
                            "" +
                            "" +
                            "");
        }
        if (theNameOfRecipe != null &&  theNameOfRecipe.equalsIgnoreCase("Spicy Shrimp and Cauliflower Mash With Garlic Kale")){
            recipe.setText("\n" +
                    "This recipe is TO DIE FOR. So so flavorful, and surprisingly healthy! Please, if you’re considering, try this out!!" +
                    "INGREDIENTS\n" +
                    "SCALE\n" +
                    "For the Cauliflower Mash\n" +
                    "    • 2 tablespoons olive oil\n" +
                    "    • 1 head cauliflower, cut into small florets (about 6 cups)\n" +
                    "    • 3 cloves garlic, minced\n" +
                    "    • 1 cup milk\n" +
                    "    • 3 cups vegetable or chicken broth\n" +
                    "    • 1 14-ounce can white beans, rinsed and drained\n" +
                    "    • 1/2 cup cornmeal\n" +
                    "    • 1/2 cup shredded cheese, like sharp cheddar or havarti\n" +
                    "    • 1 teaspoon salt\n" +
                    "For the Kale\n" +
                    "    • 1 tablespoon bacon fat (or olive oil)\n" +
                    "    • 3 cups kalettes OR chopped kale\n" +
                    "    • 3 cloves garlic, minced\n" +
                    "For the Shrimp\n" +
                    "    • 1 tablespoon olive oil\n" +
                    "    • 1 1/2 lb. shrimp (enough for 4 people)\n" +
                    "    • a few good shakes of garlic salt, chili powder, cayenne, and/or black pepper\n" +
                    "\n" +
                    "INSTRUCTIONS\n" +
                    "    1. Cauliflower Mash: Heat the olive oil in a large soup pot. Add the cauliflower and garlic. Saute for a minute or two, until the garlic is fragrant. Add the milk and 2 cups broth. Simmer for 10 minutes or until soft. Add the white beans and mash roughly with the back of a large wooden spoon. It will be soupy – that’s okay. Stir in the cornmeal and things will start to thicken a bit. Adjust the consistency by adding in the last cup of broth as needed. Stir in the cheese and season to taste.\n" +
                    "    2. Kale: Heat the bacon fat in a nonstick skillet over medium low heat. Add the greens and garlic and saute until softened. For the kalettes, I added a little water at the end to sort of steam them to finish them off. Remove kale and wipe out pan with a paper towel.\n" +
                    "    3. Shrimp: In the same skillet, add the oil over medium heat. Pat the shrimp dry. Add to the pan and sprinkle with seasonings to taste. Cook for just a few minutes and then add a quick splash of water or broth to the pan (about 2 tablespoons) to pull the browned bits and spices into something of a saucy-coating for the shrimp. It’s delicious.\n" +
                    "    4. Serve: Serve the shrimp and kale over a big pile of cauliflower mash! SO yummy.\n" +
                    "\n" +
                    "");
        }
        if (theNameOfRecipe != null &&  theNameOfRecipe.equalsIgnoreCase("Skillet Garlic Parmesan Chicken Thighs")){
                    recipe.setText("Amazing one-pan skillet meal. A mouth-watering recipe done in 30 minutes with only 262 calories per serving!" +
                            "Amazing one-pan skillet meal. A mouth-watering recipe done in 30 minutes with only 262 calories per serving!\n" +
                            "\n" +
                            "\n" +
                            "Ingredients\n" +
                            "    • 2 lbs. Just BARE Organic Boneless Skinless Chicken Thighs\n" +
                            "    • 2 teaspoons garlic powder\n" +
                            "    • 1 teaspoon ground cumin\n" +
                            "    • 1 teaspoon salt\n" +
                            "    • 1/2 teaspoon smoked paprika\n" +
                            "    • 1/2 teaspoon ground black pepper\n" +
                            "    • 1 tablespoon olive oil\n" +
                            "Parmesan Garlic Sauce:\n" +
                            "    • 3 tablespoons unsalted butter\n" +
                            "    • 2 tablespoons olive oil\n" +
                            "    • 4 garlic cloves, minced\n" +
                            "    • 3 tablespoons of grated parmesan + 1 tablespoon to garnish\n" +
                            "    • 1/4 teaspoon smoked paprika\n" +
                            "    • 1/4 teaspoon red pepper flakes\n" +
                            "    • 1 tablespoon chopped chives\n" +
                            "Instructions\n" +
                            "    1. In a small bowl, add garlic powder, ground cumin, salt, 1/2 teaspoon smoked paprika, and black pepper. Mix the spices together. Set aside.\n" +
                            "    2. Pat the chicken thighs dry.\n" +
                            "    3. Sprinkle chicken thighs with the prepared spice blend mixture. Gently rub the mixture into the thighs.\n" +
                            "    4. Heat a large cast iron skillet to medium high heat. Add 1 tablespoon of olive oil to the pan and then place chicken thighs into the pan. (you want to hear the sizzle)\n" +
                            "    5. Saute on the first side for 5-6 minutes. Flip the chicken, turn the heat down to medium and cook the chicken for 8-10 minutes. Until you don’t see any pink.\n" +
                            "    6. Remove the chicken from the pan and set on a plate.\n" +
                            "    7. Turn the heat down to low. To the skillet add butter, 2 tablespoons of olive oil, and minced garlic. Using a spoon or a whisk, scrape all the goodies (the brown bits) off the bottom of the pan. Stir until garlic is fragrant and butter is melted.\n" +
                            "    8. Add in parmesan cheese, smoked paprika, and red pepper flakes. Whisk to stir everything together. Place the chicken back in the skillet and let cook for 1-2 minutes. Remove from heat.\n" +
                            "    9. Using a spoon, pour some of that delicious sauce over each chicken thigh.\n" +
                            "    10. Garnish with 1 tablespoon of parmesan cheese and chopped chives.\n" +
                            "\n" +
                            "Nutrition\n" +
                            "    • Serving Size: 2 chicken thighs\n" +
                            "    • Calories: 262\n" +
                            "    • Sugar: 1 g\n" +
                            "    • Sodium: 419 mg\n" +
                            "    • Fat: 17 g\n" +
                            "    • Saturated Fat: 7 g\n" +
                            "    • Carbohydrates: 2 g\n" +
                            "    • Fiber: 1 g\n" +
                            "    • Protein: 23 g\n" +
                            "    • Cholesterol: 54 mg" +
                            "");
        }
                if (theNameOfRecipe != null &&  theNameOfRecipe.equalsIgnoreCase("Sun-Dried Tomato Pesto Pasta Salad")){
            recipe.setText("No one said you have to give up pasta to eat clean. Thank goodness! Go for a gluten-free quinoa penne and you can have your fix whenever you want. The kale and the artichokes, which add some extra nutrients, are always a good idea. " +
                    "INGREDIENTS\n" +
                    "SCALE\n" +
                    "For the Sun-Dried Tomato Pesto:\n" +
                    "    • 1 cup sun-dried tomatoes (stored in OLIVE oil)\n" +
                    "    • 1 cup fresh basil\n" +
                    "    • 1/4 cup reserved olive oil from Sun-dried tomato jar (or any olive oil)\n" +
                    "    • 2 tbsp pine nuts\n" +
                    "    • 1/4 cup parmesan (or nutritional yeast if vegan)\n" +
                    "    • 1 garlic clove, minced\n" +
                    "    • 1/4 cup of water\n" +
                    "For the Pasta Salad:\n" +
                    "    • 1 box of pasta (approx 4 cups)\n" +
                    "    • 3 cups artichoke hearts (stored in water), chopped\n" +
                    "    • 1/2 head of kale, stemmed and chopped into small pieces\n" +
                    "    • 3/4 tsp salt\n" +
                    "    • 1/2 tsp black pepper\n" +
                    "INSTRUCTIONS\n" +
                    "    1. Add stemmed and chopped kale to a colander and place in the sink.\n" +
                    "    2. Cook pasta according to instructions.\n" +
                    "    3. When finished, pour pasta and water over kale to wilt kale.\n" +
                    "    4. Add kale and pasta back to pot and top with artichoke hearts.\n" +
                    "    5. Place all pesto ingredients into a blender or food processor and process until well combined.\n" +
                    "    6. Add pesto to pot and stir so pasta, artichoke hearts and kale are coated.\n" +
                    "    7. Top with salt and pepper.\n" +
                    "    8. Store in refrigerator to cool and allow flavours to meld for at least 1 hour.\n" +
                    "    9. Serve warm or cold.\n" +
                    "\n" +
                    "\n");


        }

        if (theNameOfRecipe != null &&  theNameOfRecipe.equalsIgnoreCase("This Chicken Zoodle Soup")){
            recipe.setText("This Chicken Zoodle Soup Recipe Is Comfort Food Wrapped in a Whole30 Hug" +
                    "Ingredients\n" +
                    "    • 3 tablespoons ghee, divided\n" +
                    "    • 1 bone-in, skin-on chicken breast (or 2 thighs)\n" +
                    "    • 6 cups chicken bone broth\n" +
                    "    • 1 onion, diced\n" +
                    "    • 1 medium-sized carrot, diced\n" +
                    "    • 1 celery stick, diced\n" +
                    "    • 1/2 leek, cleaned and diced\n" +
                    "    • 2 garlic cloves, minced\n" +
                    "    • 1 bay leaf\n" +
                    "    • 1/2 teaspoon fresh thyme\n" +
                    "    • 3 cups zucchini noodles\n" +
                    "    • 1/2 cup fresh parsley, stems removed\n" +
                    "    • salt and pepper, to taste\n" +
                    "Directions\n" +
                    "Heat a large, heavy-bottomed saucepan or Dutch oven over medium-high heat, and then add 2 tablespoons ghee. When fully melted, place chicken skin-side down. Sear for 7 minutes, flip, and sear for an additional 5 minutes.\n" +
                    "Add bone broth, cover pot, and cook for 10 minutes. Flip chicken, cover, and cook for an additional 10 minutes, or until the internal temperature of the meat reads 160 degrees (time depends on the size and thickness of the meat).\n" +
                    "Remove chicken from pot, reserving stock for soup. Once cool, shred into bite-size pieces, discarding bones and skin.\n" +
                    "Wipe out the pot and set over medium heat; add 1 tablespoon ghee, onion, carrot, celery, leek, garlic, bay leaf, and thyme. Stir occasionally, and cook until vegetables are soft and translucent, but not browned. Add reserved stock, and bring to a simmer.\n" +
                    "Add zoodles, and cook for 5-6 minutes, or until the noodles are al dente. Stir in shredded chicken. Season with salt and pepper, to taste. Stir in parsley leaves and allow to wilt before serving.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "");
        }
        if (theNameOfRecipe != null &&  theNameOfRecipe.equalsIgnoreCase("Garlic Mushroom Quinoa")){
            recipe.setText("Technically this garlic mushroom quinoa is a side dish, but if you love mushrooms as much as we do, you can easily make this into your main meal. Hearty, healthy, and full of that irresistible herby and woody flavor, it's practically foolproof.\n" +
                    "INGREDIENTS:\n" +
                    "    • 1 cup quinoa\n" +
                    "    • 1 tablespoon olive oil\n" +
                    "    • 1 pound cremini mushrooms, thinly sliced\n" +
                    "    • 5 cloves garlic, minced\n" +
                    "    • 1/2 teaspoon dried thyme\n" +
                    "    • Kosher salt and freshly ground black pepper, to taste\n" +
                    "    • 2 tablespoons grated Parmesan\n" +
                    "DIRECTIONS:\n" +
                    "    1. In a large saucepan of 2 cups water, cook quinoa according to package instructions; set aside.\n" +
                    "    2. Heat olive oil in a large skillet over medium high heat. Add mushrooms, garlic and thyme, and cook, stirring occasionally, until tender, about 3-4 minutes; season with salt and pepper, to taste. Stir in quinoa until well combined.\n" +
                    "    3. Serve immediately, garnished with Parmesan, if desired.\n" +
                    "‘\n" +
                    "\n" +
                    "\n" +
                    "" +
                    "" +
                    "");
        }
        if (theNameOfRecipe != null &&  theNameOfRecipe.equalsIgnoreCase("Try This Keto-Friendly Steak Taco")){
            recipe.setText("Keto dieters listen up: your favorite taco fillings, including steak, are stuffed inside crispy cheddar cheese shells for a beginner recipe that's easy enough to tackle on a weeknight for one person. This recipe might leave you with a little leftover steak… but who's complaining about that? Chop it up and add it to a salad the next day. Be sure to look for a taco seasoning that is low in carbs as some brands sneak in sugar. Customize the toppings to your liking, and let the feasting begin.\n" +
                    "\n" +
                    "Ingredients\n" +
                    "    • 3/4 cup shredded cheddar cheese, divided\n" +
                    "    • 1 packet taco seasoning\n" +
                    "    • 1 New York strip steak\n" +
                    "    • 1/4 stick butter\n" +
                    "    • diced tomato, for topping\n" +
                    "    • sour cream, for topping\n" +
                    "    • sliced avocado, for topping\n" +
                    "    • sliced jalapeño, for topping\n" +
                    "    • lime zest, for topping\n" +
                    "Directions\n" +
                    "Preheat oven to 375°F. Line a sheet pan with parchment paper or a Silpat. Set out four glasses that are similar in height and rest a wooden cooking spoon over each pair of glasses. These suspended spoons will be used to shape the tortillas.\n" +
                    "Divide cheese into three mounds on top of lined sheet pan. Use hand to flatten and spread cheese into circles spaced 1-2 inches apart. Bake for 10-15 minutes, or cheese appears lacy and is golden-brown on the edges.\n" +
                    "Use a spatula to carefully drape tortillas over suspended spoons to create tortilla shape. Allow to dry and harden.\n" +
                    "Meanwhile, sprinkle taco seasoning over both sides of the steak. You may not use the whole packet.\n" +
                    "Preheat a grill or grill pan to medium-high. If using a grill pan, melt butter over the top and allow to brown slightly. For medium rare or medium steak, cook for 2-3 minutes. Rotate steak 90 degrees using a fork, and cook for an additional 2-3 minutes. Flip steak with a fork, and repeat process. Remove steak onto a plate and allow to rest for 10-15 minutes, before slicing into thin strips against the grain.\n" +
                    "To assemble, fill taco shells with pinch of lettuce, a few strips of steak, a dollop of sour cream, a smattering of diced tomato and avocado, a few thin slices of jalapeño, and a dash of lime zest.\n");
        }
        if (theNameOfRecipe != null &&  theNameOfRecipe.equalsIgnoreCase("Mediterranean Boneless Pork Chops")){
            recipe.setText("Mediterranean Boneless Pork Chops with Summer Vegetables is made with thin sliced boneless pork chops topped with sauteed summer squash, roasted tomatoes, lemon juice, olives and Feta cheese. So much flavor and color in this dish!" +
                    "I love this summer dish!! It’s so flavorful and easy to make, and the best part, the servings are generous! If you don’t eat pork you can make this with chicken.\n" +
                    "Mediterranean Boneless Pork Chops with Julienned Vegetables, a delicious, weeknight meal! Made with pan seared thin sliced boneless pork chops and served topped with sauteed julienned summer squash, roasted tomatoes, lemon juice, olives and Feta cheese. So much flavor and color in this dish!\n" +
                    "INGREDIENTS\n" +
                    "    • 16 oz 8 thin sliced center cut boneless pork chops\n" +
                    "    • 3/4 tsp of McCormick Montreal Chicken Seasoning, 25% Less Sodium\n" +
                    "    • 1 small, 6 oz zucchini, ends trimmed off\n" +
                    "    • 1 small, 6 oz yellow squash, ends trimmed off\n" +
                    "    • 1 cup halved grape tomatoes\n" +
                    "    • 1 tablespoon extra virgin olive oil\n" +
                    "    • ¼ tsp Kosher salt and fresh cracked pepper\n" +
                    "    • ¼ teaspoon oregano\n" +
                    "    • 3 garlic cloves, sliced thin\n" +
                    "    • cooking spray\n" +
                    "    • 1/4 cup of pitted and sliced Kalamata olives\n" +
                    "    • 1/4 cup of crumbled Feta cheese\n" +
                    "    •  fresh juice from 1/2 large lemon\n" +
                    "    • 1 tsp grated Lemon rind\n" +
                    "INSTRUCTIONS\n" +
                    "    • Preheat oven to 450 degrees. Season the pork chops with Montreal seasoning (or any seasoned salt you like).\n" +
                    "    • To Julienne the Zucchini and Yellow Squash: Use a mandolin fitted with a julienne blade, or slice the zucchini into 1/8-inch thick slices. Cut the slices lengthwise into 1/8-inch thick strips. (Or you can use a spiralizer)\n" +
                    "    • Toss the tomatoes with 1/2 tbsp of the olive oil, 1/8 tsp salt, pepper, and oregano.  Place tomatoes, cut side up, on a baking sheet lightly sprayed with cooking spray; roast for 10 minutes.\n" +
                    "    • Add sliced garlic and roast for another 5 minutes (this will prevent the garlic from burning).\n" +
                    "    • Transfer to a large work bowl and set aside.\n" +
                    "    • Reduce oven to 200°F.\n" +
                    "    • Heat a large non-stick skillet over medium-high heat, add remaining 1/2 tablespoon of olive oil and zucchini with 1/8 tsp salt and sauté until tender, about 5 minutes.\n" +
                    "    • Add to bowl with tomatoes and place in the warm oven.\n" +
                    "    • Working in two batches, spray the skillet with cooking spray and cook half of the the pork chops on medium-high heat for about 1 1/2 to 2 minutes on each side.  The pork chops are thin so you don’t want to over cook them or they will be tough.  Set aside on a platter.\n" +
                    "    • Remove the vegetables from the oven toss with Kalamata olives, juice of lemon and lemon rind.\n" +
                    "    • Serve the vegetables over the pork chops and top with Feta cheese.\n" +
                    "Serving: 2chops, 3/4c veggies, Calories: 230kcal, Carbohydrates: 9g, Protein: 28g, Fat: 9g, Saturated Fat: 2g, Cholesterol: 72mg, Sodium: 502mg, Fiber: 2g, Sugar: 2g");
        }
        if (theNameOfRecipe != null &&  theNameOfRecipe.equalsIgnoreCase("Healthy Chocolate Pudding Snack")){
            recipe.setText("Need a chocolate fix? This chocolate snack tastes rich and chocolaty, but it’s just Greek yogurt, cocoa powder and maple syrup. And it’s made in 2 minutes!\n" +
                    "Ingredients\n" +
                    "    • 2 tablespoons Dutch process or dark cocoa powder (not regular cocoa powder)*\n" +
                    "    • ½ cup full-fat plain Greek yogurt**\n" +
                    "    • 1 ½ tablespoons maple syrup\n" +
                    "Instructions\n" +
                    "    1. Mix everything together in a bowl. It will be very thick at first, but it will smooth out once the cocoa powder incorporates. If your yogurt is very thick, you can add ½ to 1 tablespoon water to get a bit lighter texture, but all yogurts vary. (Also, you can always add a little more cocoa powder or maple to adjust to your own taste.)\n" +
                    "Notes\n" +
                    "*The secret to this recipe is the dark cocoa powder! It is also called Dutch process cocoa powder and can be found at most grocery stores. Don’t buy the regular kind! See the section above for more about what it is and where to find it.\n" +
                    "**We have not been able to find a dairy-free yogurt that we like, so we don’t recommend trying a vegan version of this. If you’d like, try our Chocolate Peanut Butter Mousse for something similar.");
        }
        if (theNameOfRecipe != null &&  theNameOfRecipe.equalsIgnoreCase("Chocolate Covered Bananas")){
            recipe.setText("Frozen chocolate covered bananas are the perfect easy and healthy dessert! Store them in the freezer for whenever you crave a sweet bite." +
                    "Ingredients\n" +
                    "    • 2 ripe medium bananas\n" +
                    "    • 1 ½ cup dark chocolate chips* (5 ounces)\n" +
                    "    • 1 tablespoon refined coconut oil\n" +
                    "    • 1 pinch salt\n" +
                    "    • Toppings (optional): 2 tablespoons each crushed peanuts, crushed pistachios, and all natural sprinkles\n" +
                    "Instructions\n" +
                    "    1. Freeze the bananas (45 minutes): Slice bananas into 1/4-inch rounds. Place them on a baking sheet lined with parchment paper and freeze for 45 minutes. \n" +
                    "    2. Melt the chocolate: Start a pot of simmering water. Place the chocolate, coconut oil, and salt in a glass measuring cup or large wide mouth jar, and place it into the simmering water. Very carefully, stir the chocolate until it melts, using a hot pad or gloves to hold the glass. Do not let any of the water splash, or it will split the chocolate. (You can also melt the chocolate in the microwave in a liquid measuring cup, heating for about 30 second intervals and then stirring several times until the chocolate melts.)\n" +
                    "    3. Dip and top the bananas: Make sure your toppings are ready, if using. Leave the jar in the double boiler to keep the chocolate warm. Use a fork to dip each banana slice into the jar, then shake off excess chocolate.  Transfer the slice to the parchment lined baking sheet, using your finger to gently slide off the banana. Add toppings immediately (the chocolate freezes quickly) — this process is easiest with 2 people, 1 person to dip and 1 person to top. This recipe uses only 1 cup of chocolate for the bananas, but it’s nice to have extra chocolate to make the dipping process easier. You can dip pretzels or cereal into the remaining chocolate, or discard it. \n" +
                    "    4. Freeze: Return the bananas to the freezer and freeze for 30 minutes. Then transfer the banana bites to a freezer safe container.  Store up to 1 month.\n" +
                    "Notes\n" +
                    "*Only about 1 cup is used in the recipe, but you’ll need the extra to make the dipping process easier. Find extra items to dip into the remaining chocolate if you like (like pretzels, cereal, etc). \n" +
                    "");
        }
   if (theNameOfRecipe != null &&  theNameOfRecipe.equalsIgnoreCase("Baked Bell Pepper Tacos")){
            recipe.setText("This stuffed-pepper-meets-taco hybrid is calling your name, regardless of whether or not it's Taco Tuesday. You can prep these ahead of time and have them ready to pop in the oven when you get home. Save a few for the next day to make your work lunch a whole lot more colorful. " +
                    "INGREDIENTS\n" +
                    "    • 4 large bell peppers\n" +
                    "    • 3-4 cups taco filling (choose from below)\n" +
                    "    • 3/4 cup shredded cheese extra as desired\n" +
                    "    • 3/4 cup chopped tomato\n" +
                    "    • 3/4 cup chopped lettuce\n" +
                    "    • cilantro and lime as a tasty garnish\n" +
                    "FEISTY FILLING OPTIONS:\n" +
                    "    • a. 1lb ground beef, chicken, or turkey seasoned your favorite way and browned on the stove-top! I use a combination of enchilada sauce (homemade or store bought) and homemade taco seasoning to flavor mine, plus a little mexican hot sacue for a kick! You can also make your protein option in advance and keep in the fridge for 2-3 days or freezer for emergency taco night filling. This also works with my lentil-veggie taco filling too!\n" +
                    "    • b. 3-4 cups Lentil Veggie Taco Filling\n" +
                    "    • c. 3-4 cups Seasoned tofu like chipotle-style sofritos\n" +
                    "    • d. 2 cups Refried Beans or black beans + 1-2 cups sautéed veggies\n" +
                    "TASTY TOPPINGS (CHOOSE YOUR FAVORITES)\n" +
                    "    • shredded cheddar or pepper jack cheese\n" +
                    "    • sour cream or plain Greek yogurt\n" +
                    "    • fresh cilantro\n" +
                    "    • sliced jalapeños\n" +
                    "    • fresh or leftover grilled/roasted/sautéed veggies\n" +
                    "    • fresh chopped avocado\n" +
                    "    • guacamole\n" +
                    "    • salsa verde\n" +
                    "    • pico de gallo\n" +
                    "    • salsa\n" +
                    "    • Looking for extra crunch? Try crumbling a few tortilla chips on top of your bell peppers or serve them with a side of chips and salsa!\n" +
                    "INSTRUCTIONS\n" +
                    "    • Pre-heat oven to 400 degrees F. Choose your protein option(s) from the above list and cook via preferred method.\n" +
                    "    • Slice each bell pepper in half. Hollow out each pepper, removing stem, seeds, etc...\n" +
                    "    • Lay peppers on a baking sheet and cook for 8-10 minutes until al-tente or for 10-15 minutes for softer peppers.\n" +
                    "    • Fill each pepper to the brim with your taco filling of choice (see above for tasty options; I made mine t-rex this time around) and top with cheese.\n" +
                    "    • Bake for an additional 10 minutes, then pile mile-high with all your favorite taco toppings! Anything goes on taco night!\n" +
                    "NOTES\n" +
                    "Though I included the measurements I used for 8 bell pepper tacos, feel free to double, triple, or halve the recipe as desired.\n" +
                    "To fit your dietary needs, choose your own ideal combination of toppings and fillings from the lists above. The version I photographed was of the T-rex variety but snagging one of the vegan or vegetarian filling options I posted above will help you stick with your plan! You can also mix and match the fillings. Combine black beans and sautéed veggies with any of the protein options from ground turkey to tofu. Have fun with it!\n" +
                    "INGREDIENTS\n" +
                    "    • 4 large bell peppers\n" +
                    "    • 3-4 cups taco filling (choose from below)\n" +
                    "    • 3/4 cup shredded cheese extra as desired\n" +
                    "    • 3/4 cup chopped tomato\n" +
                    "    • 3/4 cup chopped lettuce\n" +
                    "    • cilantro and lime as a tasty garnish\n" +
                    "FEISTY FILLING OPTIONS:\n" +
                    "    • a. 1lb ground beef, chicken, or turkey seasoned your favorite way and browned on the stove-top! I use a combination of enchilada sauce (homemade or store bought) and homemade taco seasoning to flavor mine, plus a little mexican hot sacue for a kick! You can also make your protein option in advance and keep in the fridge for 2-3 days or freezer for emergency taco night filling. This also works with my lentil-veggie taco filling too!\n" +
                    "    • b. 3-4 cups Lentil Veggie Taco Filling\n" +
                    "    • c. 3-4 cups Seasoned tofu like chipotle-style sofritos\n" +
                    "    • d. 2 cups Refried Beans or black beans + 1-2 cups sautéed veggies\n" +
                    "TASTY TOPPINGS (CHOOSE YOUR FAVORITES)\n" +
                    "    • shredded cheddar or pepper jack cheese\n" +
                    "    • sour cream or plain Greek yogurt\n" +
                    "    • fresh cilantro\n" +
                    "    • sliced jalapeños\n" +
                    "    • fresh or leftover grilled/roasted/sautéed veggies\n" +
                    "    • fresh chopped avocado\n" +
                    "    • guacamole\n" +
                    "    • salsa verde\n" +
                    "    • pico de gallo\n" +
                    "    • salsa\n" +
                    "    • Looking for extra crunch? Try crumbling a few tortilla chips on top of your bell peppers or serve them with a side of chips and salsa!\n" +
                    "INSTRUCTIONS\n" +
                    "    • Pre-heat oven to 400 degrees F. Choose your protein option(s) from the above list and cook via preferred method.\n" +
                    "    • Slice each bell pepper in half. Hollow out each pepper, removing stem, seeds, etc...\n" +
                    "    • Lay peppers on a baking sheet and cook for 8-10 minutes until al-tente or for 10-15 minutes for softer peppers.\n" +
                    "    • Fill each pepper to the brim with your taco filling of choice (see above for tasty options; I made mine t-rex this time around) and top with cheese.\n" +
                    "    • Bake for an additional 10 minutes, then pile mile-high with all your favorite taco toppings! Anything goes on taco night!\n" +
                    "NOTES\n" +
                    "Though I included the measurements I used for 8 bell pepper tacos, feel free to double, triple, or halve the recipe as desired.\n" +
                    "To fit your dietary needs, choose your own ideal combination of toppings and fillings from the lists above. The version I photographed was of the T-rex variety but snagging one of the vegan or vegetarian filling options I posted above will help you stick with your plan! You can also mix and match the fillings. Combine black beans and sautéed veggies with any of the protein options from ground turkey to tofu. Have fun with it!" +
                    "" +
                    "" +
                    "");
        }
   if (theNameOfRecipe != null &&  theNameOfRecipe.equalsIgnoreCase("One-Pan Healthy Sausage and Veggies")){
            recipe.setText("Sheet Pan Sausage and Veggies makes for the best simple, filling, and nutritious dinner with virtually no cleanup! Toss this killer seasoning blend with your favorite veggies and smoked sausage and then roast them all to perfection. Top with freshly grated Parmesan cheese and enjoy as is or over a cooked grain.\n" +
                    "This Sheet Pan Sausage and Veggies is easily the most popular meal at my home. It’s a hit with the kids, and my husband– and I love it as well!\n" +
                    "Start by tossing loads of veggies and smoked sausage with olive oil and the best seasoning blend. This meal has it all: quick prep, practically nonexistent cleanup, inexpensive to make, and every single bite is loaded with flavor. Who says healthy can’t also be downright delicious?!\n" +
                    "I hope you love this one-pan healthy dinner as much as my family does!\n" +
                    "Variation Ideas\n" +
                    "This recipe is very forgiving and can easily be customized to fit your personal preferences. Below are some variation options:\n" +
                    "    • Veggies: Use whatever veggies you like best, but keep in mind that root veggies typically take longer to bake. Because of that, you’ll want to cut them quite small so they’ll cook at the same rate as the other veggies. Some veggies that would work great in this dish are cauliflower, Brussels sprouts, green or red bell pepper, diced sweet potato, summer squash, zucchini, onion, and/or cherry tomatoes.\n" +
                    "    • Swap potatoes: We love baby red potatoes, but baby gold (Yukon) potatoes are another favorite and work well in this meal. Whatever potatoes you use, make sure they are chopped into small pieces, so they’ll cook in the indicated amount of time.\n" +
                    "    • Spice levels: If you like a hit of spice, add the optional red pepper flakes or sprinkle red pepper flakes on individual plates. If heat isn’t your thing, leave them out — no other changes necessary!\n" +
                    "    • Add a sauce: While we love Sheet Pan Sausage and Veggies as is, but if you’d like some sort of sauce, I’d recommend a good basil pesto or similar herb sauce (like a chimichurri). For a creamy sauce, I’d recommend a cilantro–lime sauce (like the one on this Shrimp Tacos recipe). One other sauce option would be a balsamic glaze.\n" +
                    "    • Serving suggestions: For a more filling meal, serve this dish over cooked quinoa (how to cook quinoa here) or cooked rice. Don’t forget to season the quinoa or rice with salt and pepper so the meal as a whole isn’t under seasoned when served together. To keep this meal low carb, use cauliflower rice as the base.\n" +
                    "    • Sausage: More on possible variations for this ingredient below!\n" +
                    "\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "    • 2 cups (276g) diced baby red potato\n" +
                    "    • 3 cups (298g) trimmed and halved green beans\n" +
                    "    • 1 large head of broccoli (2 cups; 137g)\n" +
                    "    • 1 and 1/2 cups (161g) chopped bell peppers (2 large or 6-7 mini sweet bell peppers)\n" +
                    "    • 13 ounces (368g) smoked sausage (See Note 1)\n" +
                    "    • 6 tablespoons (73g) olive oil\n" +
                    "    • 1/4 teaspoon red pepper flakes, optional (leave out if you don't like heat!)\n" +
                    "    • 1 teaspoon paprika\n" +
                    "    • 1/2 teaspoon garlic powder\n" +
                    "    • 1 tablespoon EACH: dried oregano, dried parsley\n" +
                    "    • Salt & pepper\n" +
                    "    • Serve with: fresh parsley, quinoa/rice, lots of freshly grated Parmesan cheese\n" +
                    "INSTRUCTIONS\n" +
                    "    • PREP: Preheat the oven to 400 degrees F. Line a very large sheet pan (I use this 15x21 inch sheet pan) or 2 smaller pans with parchment paper and set aside.\n" +
                    "    • PREP VEGGIES: It is important to prep the veggies according to directions to ensure they all cook at the same rate. Wash and chop the unpeeled baby red potatoes. You want the pieces quite small. I halve the baby potatoes and then dice each half. This yields a total of 10-12 pieces per potato. Trim the green beans and then cut in half, chop the broccoli into florets, chop the peppers into 1-inch pieces, and coin the sausage in thick (1/2-inch) slices.\n" +
                    "    • OLIVE OIL AND SEASONINGS: Place all the veggies and sausage on the prepared sheet pan. Pour the olive oil and all the seasonings on top. Season to taste with salt and pepper (I add 1/2 teaspoon of salt and 1/4 teaspoon pepper to start with). Use your hands to toss and evenly coat all the veggies and sausage with seasonings. Space everything out so it has plenty of space to cook. If veggies are crammed/overlapping they'll steam instead of roast and will take longer to cook.\n" +
                    "    • BAKE: Bake 15 minutes, remove from the oven and flip/stir all the veggies around. Return to the oven and bake for another 10-15 minutes or until vegetables are crisp-tender.\n" +
                    "    • ENJOY: If desired, sprinkle freshly grated Parmesan cheese over the veggies and sausage as soon as they come out of the oven. (If you aren't adding the cheese, you'll likely need to add some more salt to the dish.) Add fresh parsley if desired and enjoy immediately. Serve over cooked rice or quinoa if desired.\n" +
                    "    • STORAGE: I don't recommend freezing this recipe; the veggies end up mushy upon being thawed. Leftovers will stay great in airtight containers in the fridge for 3-4 days. Obviously, there is a loss of texture, but overall it's still delicious!\n" +
                    "\n" +
                    "\n");
        }
   if (theNameOfRecipe != null &&  theNameOfRecipe.equalsIgnoreCase("Classic Bruschetta")){
            recipe.setText("Ingredients\n" +
                    "1 ½ cups grape or cherry tomatoes\n" +
                    "¼ cup extra virgin olive oil, divided\n" +
                    "1 tablespoon balsamic vinegar\n" +
                    "½ teaspoon salt\n" +
                    "¼ teaspoon black pepper\n" +
                    "8 large basil leaves\n" +
                    "1 (12-ounce) baguette\n" +
                    "1 large clove garlic, peeled\n" +
                    "Directions\n" +
                    "Preheat the oven to 375 F.\n" +
                    "Quarter the tomatoes and place them into a small bowl.\n" +
                    "Add 2 tablespoons of olive oil, the balsamic vinegar, salt, and pepper to the tomatoes, then stir.\n" +
                    "Chiffonade the basil by stacking the leaves in a pile. Roll the basil leaves vertically like a cigar. Starting at one end, make slices along the rolled basil leaves, making ribbons. Sprinkle the basil into the bowl of tomatoes. Stir well and set aside to marinate.\n" +
                    "Slice the baguette in half horizontally, and slice the halves in half again vertically. Place the baguette on a baking sheet and brush with the 2 remaining tablespoons of olive oil. Place in the oven and bake for 8 minutes.\n" +
                    "Remove the baguette from oven and rub each slice with the clove of garlic.\n" +
                    "Cut the baguette into the desired number of pieces and top with the tomato mixture, then serve.\n" +
                    "\n" +
                    "\n");
        }


    }
}