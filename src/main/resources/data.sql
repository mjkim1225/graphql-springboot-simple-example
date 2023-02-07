INSERT INTO `users` ( `email`, `name`, `tel`) VALUES
                  ( 'kim@naver.com', 'Kim', '010-0000-0001'),
                  ( 'janny@naver.com', 'Janny', '010-0000-0002'),
                  ( 'billie@naver.com', 'Billie Eilish', '010-0000-0003'),
                  ( 'taylor@naver.com', 'Taylor Swift', '010-0000-0004'),
                  ( 'jack@naver.com', 'Jack', '010-0000-0005'),
                  ( 'hong@hanmail.net', '홍길동', '010-0000-0006'),
                  ( 'kang@naver.com', '강감찬', '010-0000-1111');

INSERT INTO `products` (`no`, `name`) VALUES
                     ( '10001', 'TV'),
                     ( '10002', 'Notebook'),
                     ( '10003', 'Phone'),
                     ( '10004', 'Monitor'),
                     ( '10005', 'Washer'),
                     ( '10006', 'Car'),
                     ( '10007', 'Table'),
                     ( '10008', 'Beer'),
                     ( '10009', 'Bike'),
                     ( '10010', 'Boat');

INSERT INTO `orders` (`user_id`, `product_id`) VALUES
                      (1, 10),
                      (1, 5),
                      (1, 4),
                      (2, 8),
                      (3, 9),
                      (4, 1),
                      (5, 2),
                      (6, 3),
                      (7, 6),
                      (2, 7);
