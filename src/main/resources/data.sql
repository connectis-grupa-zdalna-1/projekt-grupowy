INSERT INTO public.client(id, first_name, email ) VALUES
    (1, 'Janek', 'janek@gmail.com'),
     (2, 'Filip', 'zkonopii@onet.eu'),
     (3, 'Marian','paździoch@onet.eu');


INSERT INTO public.book(id, name_of_book, author, borrowed, client_id) VALUES
    (1, 'Pan Tadeusz', 'Adam Mickiewicz', true, 1),
--     (2, 'Pan Lodowego Ogrodu', 'Jarosław Grzędowicz', true, 1 ),
--     (3, 'Metro 2033', 'Dmitrij Głuchowski', true, 1 ),
 (4, 'Herry Potter', 'J.K. Rowling', true, 2);
--     (5, 'Wiedźmin', 'Andrzej Sapkowski', false, null);


