INSERT INTO COLLECTION (ID, TITLE)
VALUES
    (1, 'Hats'),
    (2, 'Mens'),
    (3, 'Jackets'),
    (4, 'Womens'),
    (5, 'Sneakers');
INSERT INTO item (id, IMAGE_URL, NAME, PRICE,COLLECTION_ID)
VALUES
    (1, 'https://i.ibb.co/ZYW3VTp/brown-brim.png', 'Brown Brim', 25, 1),
    (2, 'https://i.ibb.co/ypkgK0X/blue-beanie.png', 'Blue Beanie', 18, 1),
    (30, 'https://i.ibb.co/xJS0T3Y/camo-vest.png', 'Camo Down Vest', 320, 2),
    (31, 'https://i.ibb.co/qMQ75QZ/floral-shirt.png', 'Floral T-shirt', 20, 2),
    (18, 'https://i.ibb.co/XzcwL5s/black-shearling.png', 'Black Jean Shearling', 125, 3),
    (19, 'https://i.ibb.co/mJS6vz0/blue-jean-jacket.png', 'Blue Jean Jacket', 90, 3),
    (23, 'https://i.ibb.co/7CQVJNm/blue-tank.png', 'Blue Tanktop', 25, 4),
    (24, 'https://i.ibb.co/4W2DGKm/floral-blouse.png', 'Floral Blouse', 20, 4),
    (10, 'https://i.ibb.co/0s3pdnc/adidas-nmd.png', 'Adidas NMD', 220, 5),
    (11, 'https://i.ibb.co/dJbG1cT/yeezy.png', 'Adidas Yeezy', 280, 5);
