PGDMP          0                y           drugsdb    13.2    13.2 
    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16394    drugsdb    DATABASE     k   CREATE DATABASE drugsdb WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_United States.1252';
    DROP DATABASE drugsdb;
                postgres    false            �           0    0    DATABASE drugsdb    ACL     c   REVOKE CONNECT,TEMPORARY ON DATABASE drugsdb FROM PUBLIC;
GRANT ALL ON DATABASE drugsdb TO PUBLIC;
                   postgres    false    2990            �            1259    16508    drug    TABLE     �   CREATE TABLE public.drug (
    drug_id bigint NOT NULL,
    company_email character varying(255),
    drug_name character varying(255),
    generic_name character varying(255),
    manufacturedate date,
    quantity integer
);
    DROP TABLE public.drug;
       public         heap    postgres    false            �            1259    16506    drug_sequence    SEQUENCE     v   CREATE SEQUENCE public.drug_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.drug_sequence;
       public          postgres    false            �          0    16508    drug 
   TABLE DATA           j   COPY public.drug (drug_id, company_email, drug_name, generic_name, manufacturedate, quantity) FROM stdin;
    public          postgres    false    201   �	       �           0    0    drug_sequence    SEQUENCE SET     <   SELECT pg_catalog.setval('public.drug_sequence', 18, true);
          public          postgres    false    200            $           2606    16515    drug drug_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY public.drug
    ADD CONSTRAINT drug_pkey PRIMARY KEY (drug_id);
 8   ALTER TABLE ONLY public.drug DROP CONSTRAINT drug_pkey;
       public            postgres    false    201            �   �   x���A
�@ϳI��$o��zY�(Y'l"�|�x�c?���j�r˯�º��<�ɋ�����s�1M���ԴѱQ�AU��׭�_��,�����cu=�XݞGj��A)@��Ã+:=v�����\���H     