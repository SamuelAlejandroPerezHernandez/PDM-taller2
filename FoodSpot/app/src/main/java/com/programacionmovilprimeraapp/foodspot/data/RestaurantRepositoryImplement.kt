package com.programacionmovilprimeraapp.foodspot.data

import com.programacionmovilprimeraapp.foodspot.model.Dish
import com.programacionmovilprimeraapp.foodspot.model.Restaurant

class RestaurantRepositoryImplement: RestaurantRepository{

    val HardCodeRestaurantsList = listOf<Restaurant>(
        Restaurant(
            1,
            "Pomodoro",
            "Restaurante italiano elegante con pizzas artesanales, pastas y recetas tradicionales italianas.",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTprJgiFSDSDAzhDX-H1JQzISC9tw7TkdG6cg&s",
            listOf("Italiana"),
            listOf<Dish>(
                Dish(
                    1,
                    "Pizza Margarita",
                    "Pizza clásica con mozzarella fresca y albahaca.",
                    "https://cdn.blog.paulinacocina.net/wp-content/uploads/2023/09/pizza-margherita-paulina-cocina-recetas.jpg"
                ),

                Dish(
                    2,
                    "Lasagna de Carne",
                    "Capas de pasta rellenas con carne y queso gratinado.",
                    "https://www.casadelatorre.com.ar/wp-content/uploads/2025/07/Firefly_plato-de-lasagna-con-salsa-de-tomate-618748-1024x797.jpg"
                ),

                Dish(
                    3,
                    "Fettuccine Alfredo",
                    "Pasta cremosa con queso parmesano.",
                    "https://stordfkenticomedia.blob.core.windows.net/df-us/rms/media/recipemediafiles/recipe%20images%20and%20files/retail/desktop%20(600x600)/2023.nov/2023_retail_fettuccine-alfredo_600x600.jpg?ext=.jpg"
                ),

                Dish(
                    4,
                    "Bruschetta Italiana",
                    "Pan tostado con tomate fresco y aceite de oliva.",
                    "https://tudodelicious.com/wp-content/uploads/2025/08/Brusqueta-Tradicional.jpg"
                )
            )
        ),

        Restaurant(
            2,
            "Monterosso Trattoria",
            "Trattoria moderna con comida italiana gourmet y ambiente elegante.",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTC70MvRrrLv15mleFK1M8bK7XP4aXpZ_fWOQ&s",
            listOf("Italiana"),
            listOf<Dish>(

                Dish(
                    5,
                    "Pizza Pepperoni",
                    "Pizza italiana con pepperoni y queso mozzarella.",
                    "https://www.sortirambnens.com/wp-content/uploads/2019/02/pizza-de-peperoni.jpg"
                ),

                Dish(
                    6,
                    "Ravioli Ricotta",
                    "Raviolis rellenos de ricotta con salsa pomodoro.",
                    "https://thesageapron.com/wp-content/uploads/2023/04/Spinach-Ricotta-Ravioli-45.jpg"
                ),

                Dish(
                    7,
                    "Risotto de Hongos",
                    "Arroz italiano cremoso con hongos frescos.",
                    "https://www.recetasnestle.com.ar/sites/default/files/srh_recipes/d3ace5fc0177d7d16e22b5b4de5777b3.jpg"
                ),

                Dish(
                    8,
                    "Panna Cotta",
                    "Postre italiano suave con frutos rojos.",
                    "https://www.recipetineats.com/tachyon/2025/09/Panna-cotta_8-close-up.jpg?resize=500%2C500"
                )
            )
        ),

        Restaurant(
            3,
            "Basilico Italian Bistro",
            "Bistro italiano moderno con pizzas y cocina mediterránea.",
            "https://cdn.theeventus.com/01J71ZBJGKPYNRF5DN7669PDDK.png",
            listOf("Italiana"),
            listOf<Dish>(

                Dish(
                    9,
                    "Spaghetti Carbonara",
                    "Pasta cremosa con tocino y parmesano.",
                    "https://leitesculinaria.com/wp-content/uploads/2024/04/spaghetti-carbonara-1200.jpg"
                ),

                Dish(
                    10,
                    "Pizza Cuatro Quesos",
                    "Pizza artesanal con mezcla de quesos italianos.",
                    "https://www.infobae.com/resizer/v2/BTS3SYGZVRCNNJME5QYF63XBTA.jpg?auth=7df3445b0c3a9afe65c363e716c13baae1cef118de4a6f2c9e3e402b9faebf64&smart=true&width=1200&height=1200&quality=85"
                ),

                Dish(
                    11,
                    "Ensalada Caprese",
                    "Tomate fresco con mozzarella y albahaca.",
                    "https://i.blogs.es/2d572b/caprese/650_1200.jpg"
                ),

                Dish(
                    12,
                    "Tiramisú",
                    "Postre italiano con café y cacao.",
                    "https://cdn7.kiwilimon.com/recetaimagen/35448/640x640/42520.jpg.jpg"
                )
            )
        ),

        Restaurant(
            4,
            "La Dolce Vita",
            "Restaurante italiano familiar con recetas artesanales.",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRRP1tVds7wM72AzPjcqEHW39BdE3TAwDOUOw&s",
            listOf("Italiana"),
            listOf<Dish>(

                Dish(
                    13,
                    "Focaccia Italiana",
                    "Pan horneado con hierbas italianas.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSut9xDtU-m4E3FWma0_V-MGAiJX9-rRRu7RA&s"
                ),

                Dish(
                    14,
                    "Pasta Alfredo",
                    "Pasta cremosa con salsa blanca.",
                    "https://www.justspices.es/media/recipe/pollo-alfredo.jpg"
                ),

                Dish(
                    15,
                    "Pizza Napolitana",
                    "Pizza tradicional napolitana con tomate fresco.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRUMfg3YrbyLn5i7rqDBbbzJD5uF7mQc3m-3g&s"
                ),

                Dish(
                    16,
                    "Cannoli",
                    "Postre italiano relleno de crema dulce.",
                    "https://www.foodandwine.com/thmb/CghgL_1vMYUU3xlQK3Q0JnENyrQ=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/cookie-cannoli-with-coffee-cream-xl-r-200403-b07045592dae4d33b88ebe2c29399623.jpg"
                )
            )
        ),

        Restaurant(
            5,
            "Dynasty",
            "Restaurante chino tradicional con comida oriental clásica.",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSfFMBZz_osykLv-rR0okWL_m9lmolf76zGeA&s",
            listOf("China"),
            listOf<Dish>(

                Dish(
                    17,
                    "Pollo Agridulce",
                    "Pollo crujiente con salsa agridulce.",
                    "https://cdn7.kiwilimon.com/recetaimagen/995/640x640/14707.jpg.jpg"
                ),

                Dish(
                    18,
                    "Chow Mein",
                    "Fideos salteados con vegetales.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3yf8YhTuRC6_vuTtrm4HkSuLCJE-BhexV5Q&s"
                ),

                Dish(
                    19,
                    "Arroz Frito Especial",
                    "Arroz salteado con camarones y pollo.",
                    "https://laroussecocina.mx/wp-content/uploads/2020/07/arroz-frito.jpg.webp"
                ),

                Dish(
                    20,
                    "Cerdo BBQ",
                    "Cerdo asado estilo cantonés.",
                    "https://ranchera.com.co/wp-content/uploads/2022/04/medallones-de-cerdo.jpg"
                )
            )
        ),

        Restaurant(
            6,
            "Pekin City",
            "Restaurante chino popular con especialidades asiáticas.",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ-LS_mgZTfXtipBGVY1Xg40ZwmJ1-1KldpVg&s",
            listOf("China"),
            listOf<Dish>(

                Dish(
                    21,
                    "Pollo Kung Pao",
                    "Pollo picante con vegetales y maní.",
                    "https://comedera.com/wp-content/uploads/sites/9/2022/04/pollo-kung-pao.jpg?w=500&h=500&crop=1"
                ),

                Dish(
                    22,
                    "Dumplings",
                    "Empanaditas chinas rellenas de carne.",
                    "https://assets.tmecosys.com/image/upload/t_web_rdp_recipe_584x480/img/recipe/ras/Assets/dc2b9450-28a0-4652-8b2c-3548b218ffc9/Derivates/63cf5870-9de5-4fa5-84b4-6d992a988329.jpg"
                ),

                Dish(
                    24,
                    "Wantán Frito",
                    "Wantanes rellenos y crujientes.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2Of9kpkONUViXcbX9MUK220Zm-26D8PPP0A&s"
                ),

                Dish(
                    25,
                    "Costillas Agridulces",
                    "Costillas bañadas en salsa dulce.",
                    "https://www.cocinadelirante.com/800x600/filters:format(webp):quality(75)/sites/default/files/images/2024/06/recetas-de-costillas-de-cerdo-agridulce.jpg"
                )
            )
        ),

        Restaurant(
            7,
            "Chinatown",
            "Comida china tradicional con gran variedad de platillos.",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStDDeQzFUQxfZXiigP9UGr7bLNj5F22-d0pQ&s",
            listOf("China"),
            listOf<Dish>(

                Dish(
                    26,
                    "Pollo Teriyaki",
                    "Pollo glaseado con salsa teriyaki.",
                    "https://imag.bonviveur.com/pollo-en-salsa-teriyaki.jpgl"
                ),

                Dish(
                    27,
                    "Arroz Cantonés",
                    "Arroz con vegetales y carne.",
                    "https://i.blogs.es/8424ac/arroz-frito-chino/1200_900.jpg"
                ),

                Dish(
                    28,
                    "Sopa Ramen",
                    "Caldo oriental con fideos.",
                    "https://elmundoeats.es/wp-content/uploads/2021/02/FP-Quick-30-minutes-chicken-ramen-500x375.jpg"
                ),

                Dish(
                    29,
                    "Camarones Tempura",
                    "Camarones empanizados crujientes.",
                    "https://buenprovecho.hn/wp-content/uploads/2023/03/Camarones_tempura_y_salsa_de_tamarindo.png"
                )
            )
        ),

        Restaurant(
            8,
            "Golden Dragon",
            "Restaurante asiático con recetas tradicionales chinas.",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSb4nlPgU8FHIDGFDI02mNc7b95Rmks2tGqzA&s",
            listOf("China"),
            listOf<Dish>(

                Dish(
                    30,
                    "Rollitos Primavera",
                    "Rollitos rellenos de vegetales.",
                    "https://content-cocina.lecturas.com/medio/2022/03/03/rollitos-de-primavera-con-carne-y-salsa-de-soja_00000000_240402112349_1200x1200.jpg"
                ),

                Dish(
                    31,
                    "Pollo con Naranja",
                    "Pollo crujiente con salsa de naranja.",
                    "https://ariztia.com/wp-content/uploads/2023/11/pollo-con-salsa-de-naranja.jpg"
                ),

                Dish(
                    32,
                    "Arroz con Camarones",
                    "Arroz oriental con camarones.",
                    "https://imag.bonviveur.com/servir-el-arroz-con-camarones-colombiano.jpg"
                ),

                Dish(
                    33,
                    "Fideos Chinos",
                    "Fideos salteados estilo oriental.",
                    "https://cdn7.kiwilimon.com/recetaimagen/40579/640x640/54173.jpg.webp"
                )
            )
        ),

        Restaurant(
            9,
            "Seoul Garden",
            "Restaurante coreano especializado en BBQ y comida tradicional.",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQyl_Oij-VUalVnTrIQ7GnJTyEobY4TwlUQLA&s",
            listOf("Coreana"),
            listOf<Dish>(

                Dish(
                    34,
                    "Bibimbap",
                    "Arroz coreano con vegetales y carne.",
                    "https://www.kikkoman.es/fileadmin/_processed_/4/b/csm_1650_Korean_bibimbap_Mobile_Header_9047d51b40.webp"
                ),

                Dish(
                    35,
                    "Korean BBQ",
                    "Carne marinada estilo coreano.",
                    "https://thewoksoflife.com/wp-content/uploads/2021/04/vegan-korean-bbq-8-500x375.jpg"
                ),

                Dish(
                    36,
                    "Kimchi Fried Rice",
                    "Arroz frito con kimchi.",
                    "https://static01.nyt.com/images/2021/01/17/dining/kimchi-rice/kimchi-rice-mediumSquareAt3X-v2.jpg"
                ),

                Dish(
                    37,
                    "Tteokbokki",
                    "Pasteles de arroz picantes.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVr_8q9DNZ7GuFY-vBV77VHu-frXlMmmAsIQ&s"
                )
            )
        ),

        Restaurant(
            10,
            "Tae Guk Gi",
            "Comida coreana tradicional y street food asiática.",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQb3kIxzxm7I5faiuk-GM12gvIDu36NvuKj9A&s",
            listOf("Coreana"),
            listOf<Dish>(

                Dish(
                    38,
                    "Japchae",
                    "Fideos coreanos con vegetales.",
                    "https://static01.nyt.com/images/2024/03/21/multimedia/ek-sheet-pan-japchae-tzvf/ek-sheet-pan-japchae-tzvf-mediumSquareAt3X.jpg"
                ),

                Dish(
                    39,
                    "Corn Dogs Coreanos",
                    "Corn dogs estilo Seoul.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_vaQ_ebUL_3QTNY4nW1hgAMa0pGRKjEM62g&s"
                ),

                Dish(
                    40,
                    "Kimchi",
                    "Vegetales fermentados tradicionales.",
                    "https://www.savorysweetspoon.com/wp-content/uploads/2025/10/easy-kimchi-1x1-1.jpg"
                ),

                Dish(
                    41,
                    "Bulgogi",
                    "Carne dulce marinada estilo coreano.",
                    "https://iamhomesteader.com/wp-content/uploads/2020/07/bulgogi.jpg"
                )
            )
        ),

        Restaurant(
            11,
            "K-Food SV",
            "Restaurante moderno con auténtica comida coreana.",
            "https://www.shutterstock.com/image-vector/illustration-simple-modern-initial-k-260nw-1136964467.jpg",
            listOf("Coreana"),
            listOf<Dish>(

                Dish(
                    42,
                    "Ramyeon",
                    "Sopa coreana de fideos picante.",
                    "https://cdn7.kiwilimon.com/recetaimagen/32293/640x640/37029.jpg.webp"
                ),

                Dish(
                    43,
                    "Kimbap",
                    "Rollos coreanos rellenos.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQM5faElV8Y-lV5SpUuJom_XMvTIarA-Dkhkg&s"
                ),

                Dish(
                    44,
                    "Dakgalbi",
                    "Pollo picante coreano.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqRaxdzwJaOMN0DY-fViI2wwVMUCSnfVYr1g&s"
                ),

                Dish(
                    45,
                    "Hotteok",
                    "Panqueque dulce coreano.",
                    "https://stellanspice.com/wp-content/uploads/2022/01/IMG_3873-2-500x375.jpeg"
                )
            )
        ),

        Restaurant(
            12,
            "Hanbok Kitchen",
            "Sabores coreanos tradicionales y modernos.",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8ofWgQyHDPXoiZfcDkHpiuPyTFFXl6cqiwg&s",
            listOf("Coreana"),
            listOf<Dish>(

                Dish(
                    46,
                    "Samgyeopsal",
                    "Cerdo a la parrilla estilo coreano.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNvW9SmsT9TCvbTB35ZnVFlJO9TrqTt5qoHQ&s"
                ),

                Dish(
                    47,
                    "Kimchi Jjigae",
                    "Estofado coreano picante.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSF2c5x7HjXsuQzhz4uZxRbHjyObpulPrX_9g&s"
                ),

                Dish(
                    48,
                    "<Mandu>",
                    "Dumplings coreanos rellenos.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS6wju2wjYeCJMA6J8Kq2Lw0zc6BNHSIzC3QQ&s"
                ),

                Dish(
                    49,
                    "Bingsu",
                    "Postre coreano con hielo raspado.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7T5Q8DSCDuWHjrViXoHA-W7q-0CA8vwVEow&s"
                )
            )
        ),

        Restaurant(
            13,
            "Burger King",
            "Cadena de comida rápida especializada en hamburguesas.",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSi1YUsojqPKLq9Z4Ey3w_TEJ-XZHA4Y4Jjuw&s",
            listOf("Comida Rapida"),
            listOf(
                Dish(
                    50,
                    "Whopper",
                    "Hamburguesa clásica con carne a la parrilla.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_HtwbEfvgLxyzJ2NyKoC-DHGtqT-yZPP-ww&s"
                ),

                Dish(
                    51,
                    "Chicken Fries",
                    "Tiras de pollo crujientes.",
                    "https://www.loveandotherspices.com/wp-content/uploads/2023/11/air-fryer-frozen-chicken-fries-featured.jpg"
                ),

                Dish(
                    52,
                    "King Nuggets",
                    "Nuggets de pollo dorados.",
                    "https://www.burgerking.it/assets/img/console/mo/products/504image_sito_slide_it.png?v=1709827220"
                ),

                Dish(
                    53,
                    "Papas Fritas",
                    "Papas fritas crujientes.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTvoUSfd1vSmwbf4Uw6k7hmIV1NpAzqKC5WzA&s"
                )
            )
        ),

        Restaurant(
            14,
            "MCDonald´s",
            "Cadena internacional de hamburguesas y comida rápida.",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTw8jO9eC3_62cmHaMI5eveXB2sPm53oHlM8A&s",
            listOf("Comida Rapida"),
            listOf<Dish>(

                Dish(
                    54,
                    "Big Mac",
                    "Hamburguesa icónica con doble carne.",
                    "https://s7d1.scene7.com/is/image/mcdonalds/DC_202302_0005-999_BigMac_1564x1564-1:product-header-mobile?wid=1313&hei=1313&dpr=off"
                ),

                Dish(
                    55,
                    "McNuggets",
                    "Nuggets de pollo crujientes.",
                    "https://www.foodandwine.com/thmb/25k7IDKxNPJ9jHSHgBcLSZ5S_lc=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/Spicy-McNuggets-Are-Back-at-McDonalds-FT-BLOG0923-43139bdeb0874fc59af1abd48e5c5e34.jpg"
                ),

                Dish(
                    56,
                    "Cuarto de Libra",
                    "Hamburguesa grande con queso.",
                    "https://www.mcdonalds.com.py/rails/active_storage/blobs/redirect/eyJfcmFpbHMiOnsibWVzc2FnZSI6IkJBaHBBcnM0IiwiZXhwIjpudWxsLCJwdXIiOiJibG9iX2lkIn19--49be130f1ad2f23e6f67c0cceacef3ac9340b493/Banner%201000x1000%20-%20McCombo%20Cuarto%20de%20Libra%20-%20Imagen%20de%20producto.png"
                ),

                Dish(
                    57,
                    "McFlurry",
                    "Helado cremoso con toppings.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSXrkm0QuztTanexAv3QdIC919KEq-hyei3xw&s"
                )
            )
        ),

        Restaurant(
            15,
            "Wendy's",
            "Restaurante de comida rápida famoso por sus hamburguesas.",
            "https://i.pinimg.com/474x/ea/47/76/ea47767d77c08926cdb3b6f4234de78f.jpg",
            listOf("Comida Rapida"),
            listOf<Dish>(

                Dish(
                    58,
                    "Dave's Single",
                    "Hamburguesa clásica con carne fresca.",
                    "https://www.foodrepublic.com/img/gallery/how-to-nab-free-wendys-dave-single-cheeseburgers-all-week-long/intro-1707247940.jpg"
                ),

                Dish(
                    59,
                    "Baconator",
                    "Hamburguesa con abundante tocino.",
                    "https://www.allrecipes.com/thmb/Jd5Nhymu7u3EHyaIDBAY_EsVN2M=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/ar-wendys-baconator-4x3-587ab41eed0a4c418fd656e2cfdda63d.jpg"
                ),

                Dish(
                    60,
                    "Papas con Queso",
                    "Papas fritas con queso cheddar.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTe_KXx9odb4wOB2r-p5MX0Kg8iPgQLKlNa5w&s"
                ),

                Dish(
                    61,
                    "Frosty",
                    "Postre helado cremoso.",
                    "https://www.foodandwine.com/thmb/DrYB471ADGtuq3qbDHERy3U_b1M=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/You-Can-Now-Customize-Your-Wendys-Frosty-FT-BLOG0225-d50bf8930d794dcf8925b28cd5235f2c.jpg"
                )
            )
        ),

        Restaurant(
            16,
            "KFC",
            "Cadena de pollo frito reconocida mundialmente.",
            "https://media.tenor.com/kkb548hIQfUAAAAe/kfc-logo.png",
            listOf("Comida Rapida"),
            listOf<Dish>(

                Dish(
                    62,
                    "Bucket de Pollo",
                    "Pollo frito crujiente.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRtqtZBo3SzpuCltBo5TjvFQqCjAkjfi0IkPQ&s"
                ),

                Dish(
                    63,
                    "Zinger Burger",
                    "Hamburguesa de pollo picante.",
                    "https://pizzericrust.com/wp-content/uploads/2025/07/WhatsApp_Image_2025-07-11_at_11.58.45_PM-removebg-preview.png"
                ),

                Dish(
                    64,
                    "Puré de Papa",
                    "Puré cremoso con gravy.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSk5iHcld3QLbOeSqC07snXkYYEvV-6tUk_QA&s"
                ),

                Dish(
                    65,
                    "Popcorn Chicken",
                    "Bocados de pollo crujientes.",
                    "https://img.buzzfeed.com/video-api-prod/assets/c2c3a2ffe8b740baa57c9a51fdc9eec1/BFV11503_CheddarRanchPopcornChicken-ThumbTextless1080.jpg?resize=1200:*"
                )
            )
        )
    )

    override suspend fun getRestaurants(): List<Restaurant>{
        return HardCodeRestaurantsList
    }
}